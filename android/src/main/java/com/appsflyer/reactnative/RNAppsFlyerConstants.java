package com.appsflyer.reactnative;

/**
 * Created by maxim on 11/17/16.
 */

public class RNAppsFlyerConstants {

    final static String PLUGIN_VERSION = "6.17.0";
    final static String NO_DEVKEY_FOUND = "No 'devKey' found or its empty";
    final static String UNKNOWN_ERROR = "AF Unknown Error";
    final static String SUCCESS = "Success";
    final static String NO_EVENT_NAME_FOUND = "No 'eventName' found or its empty";
    final static String EMPTY_OR_CORRUPTED_LIST = "No arguments found or list is corrupted";
    final static String INVALID_URI = "Passed string is not a valid URI";


    final static String afIsDebug = "isDebug";
    final static String afDevKey = "devKey";
    final static String afEmailsCryptType = "emailsCryptType";
    final static String afEmails = "emails";

    final static String afConversionData = "onInstallConversionDataListener";
    final static String afDeepLink = "onDeepLinkListener";

    final static String afSuccess = "success";
    final static String afFailure = "failure";
    final static String afOnAttributionFailure = "onAttributionFailure";
    final static String afOnAppOpenAttribution = "onAppOpenAttribution";
    final static String afOnInstallConversionFailure = "onInstallConversionFailure";
    final static String afOnInstallConversionDataLoaded = "onInstallConversionDataLoaded";
    final static String afOnDeepLinking = "onDeepLinking";

    final static String INVITE_FAIL = "Could not create invite link";
    final static String INVITE_CHANNEL = "channel";
    final static String INVITE_CAMPAIGN = "campaign";
    final static String INVITE_REFERRER = "referrerName";
    final static String INVITE_IMAGEURL = "referreImageURL";
    final static String INVITE_CUSTOMERID = "customerID";
    final static String INVITE_DEEPLINK = "baseDeepLink";
    final static String PROMOTE_ID = "promotedAppId";
    final static String INVITE_BRAND_DOMAIN = "brandDomain";

    //RECEIPT VALIDATION
    final static String PUBLIC_KEY = "publicKey";
    final static String SIGNATURE = "signature";
    final static String PURCHASE_DATA = "purchaseData";
    final static String PRICE = "price";
    final static String CURRENCY = "currency";
    final static String ADDITIONAL_PARAMETERS = "additionalParameters";
    final static String NO_PARAMETERS_ERROR = "Please provide purchase parameters";
    final static String VALIDATE_SUCCESS = "In-App Purchase Validation success";
    final static String VALIDATE_FAILED = "In-App Purchase Validation failed with error: ";

    final static String MONETIZATION_NETWORK = "monetizationNetwork";
    final static String CURRENCY_ISO4217_CODE = "currencyIso4217Code";
    final static String AF_REVENUE = "revenue";
    final static String AF_MEDIATION_NETWORK = "mediationNetwork";
    final static String AF_ADDITIONAL_PARAMETERS = "additionalParameters";

    //Purchase Connector
    final static String EVENT_SUBSCRIPTION_VALIDATION_SUCCESS = "subscriptionValidationSuccess";
    final static String EVENT_SUBSCRIPTION_VALIDATION_FAILURE = "subscriptionValidationFailure";
    final static String EVENT_IN_APP_PURCHASE_VALIDATION_SUCCESS = "inAppPurchaseValidationSuccess";
    final static String EVENT_IN_APP_PURCHASE_VALIDATION_FAILURE = "inAppPurchaseValidationFailure";
    final static String ENABLE_MODULE_MESSAGE = "Please set appsflyer.enable_purchase_connector to true in your gradle.properties file.";
}

