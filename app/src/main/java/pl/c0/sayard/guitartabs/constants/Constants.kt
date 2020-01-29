package pl.c0.sayard.guitartabs.constants

const val API_ENDPOINT = "https://api.ultimate-guitar.com/api/v1"
const val UG_USERAGENT = "UGT_ANDROID/4.11.1 (Pixel; 8.1.0)"

//official constants used by the Ultimate Guitar app:
const val REFRESH = "/auth/refresh"
const val ALL_FAVORITE_TABS = "/list/myTab"
const val ALL_FAVORITE_PRO_TABS = "/list/tabPro"
const val COMMENTS = "/tab/comment"
const val COMMENT_LIKE = "/tab/comment/like"
const val COMMENT_DISLIKE = "/tab/comment/dislike"
const val TECHNIQUES = "/list/guitar/technique"
const val TAB_VIDEOS = "/video/tab"
const val VIDEO_LIKES = "/video/like"
const val VIDEO_VIEW = "/video/view"
const val VIMEO_VIDEOS = "/video/my/vimeo"
const val USER_VIDEOS = "/video/user"
const val TAB_TECHNIQUES = "/tab/technique"
const val LEARNING_TRACKER = "/list/learning/tracker"
const val CAN_PLAY_TABS = "/list/canPlay"
const val PLAY_LATER_TABS = "/list/playLater"
const val CAN_PLAY_CHORDS = "/list/chord/library"
const val TAB_INFO = "/tab/info"
const val TAB_URL = "/tab/url" //TODO see if this is valid: urlString := fmt.Sprintf("%s/tab/url?url=%s", ugAPIEndpoint, urlParam)
const val ALL_PLAYLIST = "/list/songbook/collection"
const val PLAYLIST_TABS = "/list/songbook/tab"
const val HISTORY = "/list/history"
const val TAB_SETTINGS = "/setting/tab"
const val TAB_TRACK = "/setting/track"
const val ACCOUNT_SETTINGS = "/setting/user"
const val APPLICATURE = "/tab/applicature"
const val TAB_PRO_BROTHER = "/tab/tabProBrother"
const val EXPLORE_TABS = "/tab/explore"
const val EXPLORE_VIDEOS = "/video/explore"
const val RANDOM = "/tab/random"
const val RATING = "/tab/rating"
const val SUGGESTION = "/tab/suggestion"
const val SEARCH = "/tab/search"
const val TAB_PACKS = "/tab/list/tabPack"
const val LOGIN = "/auth/login"
const val OAUTH = "/auth/oauth"
const val PASSWORD = "/auth/password"
const val STATISTIC_DEVICE = "/statistic/device"
const val STATISTIC_INSTALL = "/statistic/android/install"
const val PUSH_TOKEN = "/push/androidToken"
const val NEWS = "/app/news"
const val UG_SERVER_TIME = "/common/hello"
const val UG_SERVICES = "/purchase/service/access"
const val ANDROID_TRANSACTION = "/purchase/transaction/android"
const val FEATURED_COLLECTIONS = "/list/songbook/featured"
const val SONGBOOK_LIKE = "/list/songbook/like"
const val SONGBOOK_HIT = "/list/songbook/hit"
const val PROGRESS_SESSION = "/list/learning/session"
const val PROGRESS_TAB_SESSIONS = "/list/learning/tab"
const val PROGRESS_TRACKER = "/list/learning/tracker"
const val AB_TESTS = "/app/ab/test"

// Here are the rough known tab types
const val TabTypeVideo = 100 // ??
const val TabTypeTabs = 200
const val TabTypeChords = 300
const val TabTypeBass = 400
const val TabTypePro = 500
const val TabTypePower = 600 // ??
const val TabTypeDrums = 700
const val TabTypeUkulele = 800
const val TabTypeOfficial = 900
const val TabTypeAll = 1000
