/* tslint:disable */
/* eslint-disable */
/**
 * FlagQuest Backend
 * The API for the FlagQuest guessing game
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Options } from './Options';
import {
    OptionsFromJSON,
    OptionsFromJSONTyped,
    OptionsToJSON,
} from './Options';

/**
 * 
 * @export
 * @interface RequestLobby
 */
export interface RequestLobby {
    /**
     * 
     * @type {string}
     * @memberof RequestLobby
     */
    name?: string;
    /**
     * uuid of player
     * @type {string}
     * @memberof RequestLobby
     */
    admin?: string;
    /**
     * 
     * @type {Options}
     * @memberof RequestLobby
     */
    options?: Options;
}

/**
 * Check if a given object implements the RequestLobby interface.
 */
export function instanceOfRequestLobby(value: object): boolean {
    return true;
}

export function RequestLobbyFromJSON(json: any): RequestLobby {
    return RequestLobbyFromJSONTyped(json, false);
}

export function RequestLobbyFromJSONTyped(json: any, ignoreDiscriminator: boolean): RequestLobby {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'admin': json['admin'] == null ? undefined : json['admin'],
        'options': json['options'] == null ? undefined : OptionsFromJSON(json['options']),
    };
}

export function RequestLobbyToJSON(value?: RequestLobby | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'admin': value['admin'],
        'options': OptionsToJSON(value['options']),
    };
}

