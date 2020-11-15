package jp.kwebs;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

/**
 * ファイル属性操作ユーティリティ
 * （パブリックドメインです）
 *
 * @author T.Kawaba
 *
 */
public class Attr {

	private Attr() {
	}

	/**
	 * FileTime を LocalDateTime に変換する
	 *
	 * @param ftime
	 *            変換するFileTimeの値
	 * @return 変換したLocalDateTimeの値
	 */
	public static LocalDateTime toLocalDateTime(FileTime ftime) {
		return LocalDateTime.ofInstant(ftime.toInstant(), ZoneId.systemDefault());
	}

	/**
	 * LocalDateTime を FileTime に変換する
	 *
	 * @param dateTime
	 *            変換するLocalDateTimeの値
	 * @return 変換したFileTimeの値
	 */
	public static FileTime toFileTime(LocalDateTime dateTime) {
		return FileTime.from(toInstant(dateTime));
	}

	/**
	 * LocalDateTime を Instant に変換する
	 *
	 * @param dateTime
	 *            変換するLocalDateTimeの値（ゾーンは Asia/Tokyo）
	 * @return 変換したInstantの値
	 */
	public static Instant toInstant(LocalDateTime dateTime) {
		return toInstant(dateTime, "Asia/Tokyo");
	}

	/**
	 * LocalDateTime を Instant に変換する
	 *
	 * @param dateTime
	 *            変換するLocalDateTimeの値
	 * @param zoneId
	 *            ゾーンID
	 * @return 変換したInstantの値
	 */
	public static Instant toInstant(LocalDateTime dateTime, String zoneId) {
		return dateTime.atZone(ZoneId.of(zoneId)).toInstant();
	}

	/**
	 * ユーザーのプリンシパルを返す
	 *
	 * @param userid
	 *            ユーザーID
	 * @return ユーザーのプリンシパル
	 * @throws UserPrincipalNotFoundException
	 *             - その主体が存在しないか、グループでない場合
	 * @throws IOException
	 *             - 入出力エラーが発生した場合
	 * @throws SecurityException
	 *             - デフォルト・プロバイダで、セキュリティ・マネージャがインストールされている場合は、RuntimePermission("lookupUserInformation")がチェックされます。
	 */
	public static UserPrincipal getPrincipal(String userid)
			throws UserPrincipalNotFoundException, SecurityException, IOException {
		return FileSystems.getDefault()
				.getUserPrincipalLookupService()
				.lookupPrincipalByName(userid);
	}

	/**
	 * 文字列表記のパーミッションから、PosixFilePermissionのSetを作って返す
	 *
	 * @param premissionStr
	 *            文字列表記のパーミッション(例 "rwxr-xr--")
	 * @return PosixFilePermissionのSet
	 */
	public static Set<PosixFilePermission> toPermission(String premissionStr) {
		return PosixFilePermissions.fromString(premissionStr);
	}

	/**
	 * PosixFilePermissionのSetから文字列表記のパーミッションを返す
	 *
	 * @param premission
	 *            PosixFilePermissionのSet
	 * @return 文字列表記のパーミッション
	 */
	public static String toPremissionStr(Set<PosixFilePermission> premission) {
		return PosixFilePermissions.toString(premission);
	}

}
