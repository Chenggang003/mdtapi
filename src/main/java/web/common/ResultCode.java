package web.common;

public class ResultCode {
	
	/**
	 * 200 --- presentation synchronized successfully.
	 */
	public static final String SYNC_SUCCESS = "200";
	
	/**
	 * OK
	 */
	public static final String SYNC_SUCCESS_DESC = "presentation synchronized successfully";
	
	/**
	 * 403 --- authentication token error.
	 */
	public static final String AUTH_TOKEN_ERROR = "403";
	
	/**
	 * authentication token error.
	 */
	public static final String AUTH_TOKEN_ERROR_DESC = "authentication token error";
	
	/**
	 * 500 --- server inner error.
	 */
	public static final String SERVER_INNER_ERROR = "500";
	
	/**
	 * server inner error.
	 */
	public static final String SERVER_INNER_ERROR_DESC = "server inner error";
	
	
	/**
	 * 400 --- many customer’s profiles that it’s required Items, but it’s empty.
	 */
	public static final String PROFILES_REQUIRED_ERROR = "400";
	
	/**
	 * many customer’s profiles that it’s required Items, but it’s empty.
	 */
	public static final String PROFILES_REQUIRED_ERROR_DESC = "many customer’s profiles that it’s required Items, but it’s empty";
	
	/**
	 * 401 --- Device required items can't be empty! And deviceId or deviceName must exist.
	 */
	public static final String DEVICE_REQUIRED_ERROR = "401";
	
	/**
	 * Device required items can't be empty! And deviceId or deviceName must exist.
	 */
	public static final String DEVICE_REQUIRED_ERROR_DESC = "Device required items can't be empty! And deviceId or deviceName must exist.";
	
	
	/**
	 * 410 --- E-Mail format error.
	 */
	public static final String EMAIL_FORMAT_ERROR = "410";
	
	/**
	 * 410 --- E-Mail format error.
	 */
	public static final String EMAIL_FORMAT_ERROR_DESC = "E-Mail format error";
	
	/**
	 * 411 --- E-Mail not exist.
	 */
	public static final String EMAIL_NOT_EXIST = "411";
	
	/**
	 * 411 --- E-Mail not exist.
	 */
	public static final String EMAIL_NOT_EXIST_DESC = "E-Mail not exist";
	
	/**
	 * 412 --- E-Mail exist.
	 */
	public static final String EMAIL_EXIST = "412";
	
	/**
	 * 412 --- E-Mail exist.
	 */
	public static final String EMAIL_EXIST_DESC = "E-Mail exist";
	
	
	/**
	 * 420 --- Account not exist (email is empty).
	 */
	public static final String ACCOUNT_NOT_EXIST = "420";
	
	/**
	 * 420 --- Account not exist (email is empty).
	 */
	public static final String ACCOUNT_NOT_EXIST_DESC = "Account not exist (email is empty)";
	
	
	/**
	 * 421 --- Device account not exist!
	 */
	public static final String DEVICE_ACCOUNT_NOT_EXIST = "421";
	
	/**
	 * 421 --- Device account not exist!
	 */
	public static final String DEVICE_ACCOUNT_NOT_EXIST_DESC = "Device account not exist";
	
	
	/**
	 * 423 --- Not weu account
	 */
	public static final String NOT_WEU_ACCOUNT = "423";
	
	/**
	 * 423 --- Not weu account
	 */
	public static final String NOT_WEU_ACCOUNT_DESC = "Not weu account";
	
	/**
	 * 431 --- New email or old email is empty.
	 */
	public static final String NEW_OR_OLD_EMAIL_EMPTY = "431";
	
	/**
	 * 431 --- New email or old email is empty.
	 */
	public static final String NEW_OR_OLD_EMAIL_EMPTY_DESC = "New email or old email is empty";
	
	/**
	 * 432 --- New password or old password is empty.
	 */
	public static final String NEW_OR_OLD_PWD_EMPTY = "432";
	
	/**
	 * 432 --- New password or old password is empty.
	 */
	public static final String NEW_OR_OLD_PWD_EMPTY_DESC = "New password or old password is empty";
	
	/**
	 * 433 --- Old password or email error.
	 */
	public static final String OLD_PWD_OR_EMAIL_ERROR = "433";
	
	/**
	 * 433 --- Old password or email error.
	 */
	public static final String OLD_PWD_OR_EMAIL_ERROR_DESC = "Old password or email error";
	
	
	/**
	 * 440 --- Brand, Region and Status can’t be empty.
	 */
	public static final String BRAND_REGION_STATUS_EMPTY = "440";
	
	/**
	 * 440 --- Brand, Region and Status can’t be empty.
	 */
	public static final String BRAND_REGION_STATUS_EMPTY_DESC = "Brand, Region and Status can’t be empty";
	
	/**
	 * 441 --- Brand does not exist.
	 */
	public static final String BRAND_NOT_EXIST = "441";
	
	/**
	 * 441 --- Brand does not exist.
	 */
	public static final String BRAND_NOT_EXIST_DESC = "Brand does not exist";
	
	
	/**
	 * 442 --- Region does not exist.
	 */
	public static final String REGION_NOT_EXIST = "442";
	
	/**
	 * 442 --- Region does not exist.
	 */
	public static final String REGION_NOT_EXIST_DESC = "Region does not exist";
	
	
	/**
	 * 443 --- Status must be 1 or 0.
	 */
	public static final String STATUS_ERROR = "443";
	
	/**
	 * 443 --- Status must be 1 or 0.
	 */
	public static final String STATUS_ERROR_DESC = "Status must be 1 or 0";
	
}
