package cordova-plugin-disablescreenshot;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class DisableScreenShot extends CordovaPlugin {
    private cordova-plugin-disablescreenshot mContext;
    // @Override
    // public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    //     if (action.equals("coolMethod")) {
    //         String message = args.getString(0);
    //         this.coolMethod(message, callbackContext);
    //         return true;
    //     }
    //     return false;
    // }

    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }

     @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        mContext = this;
        if ("DisableScreenShot".equals(action)) {
            show(args.getString(0), callbackContext);
            return true;
        }

        return false;
    }

    private void disablescreenshot(boolean msg, CallbackContext callbackContext) {
        if (msg == null) {
            callbackContext.error("Empty message!");
        } else {
            mContext.cordova.getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
            callbackContext.success(msg);
        }
    }
}
