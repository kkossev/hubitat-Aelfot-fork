/*
ACHTUNG!! 
    Lediglich ThermostatModeV2 von Hubitat unterstützt. Es fehlen Modi: Manufacturer Specific und Full Power
    Lediglich ThermostatSetPointV2 von Hubitat unterstützt. Keine Nachteile.
    Lediglich SecurityV1 von Hubitat unterstützt.
    ZWavePlusInfoV2 in Hubitat.

firmware update metadata v3
power level v1
transport service v2 u
*/


metadata {
	definition (name: "Eurotronic Spirit", namespace: "forgetiger55122", author: "Ravil Rubashkin") {		
        	capability "Configuration"
        	capability "Battery"
		capability "Lock"
		capability "SwitchLevel"
        	capability "Thermostat"  
                
        	command "heatingSetpointUp"
        	command "heatingSetpointDown"
        	command "coolingSetpointUp"
        	command "coolingSetpointDown"
        	command "thermostatModeOff"
        	command "thermostatModeHeat"
        	command "thermostatModeEnergySaveHeat"
        	command "thermostatModeFullPower"
        	command "thermostatModeManufacturerSpecific"
        
		fingerprint mfr: "0148", prod: "0003", model: "0001", deviceJoinName: "Eurotronic Spirit TRV"
	}
	
    	def LCDinvertOptions = [:]
		LCDinvertOptions << ["0" : "Ja"]                 			//0x00
		LCDinvertOptions << ["1" : "Nein"]               			//0x01
				
	def LCDtimeoutOptions = [:]
		LCDtimeoutOptions << ["0"  : "Immer an"]         			//0x00
        	LCDtimeoutOptions << ["1"  : "1 Secunde"]        			//0x01
        	LCDtimeoutOptions << ["2"  : "2 Secunden"]       			//0x02
        	LCDtimeoutOptions << ["3"  : "3 Secunden"]       			//0x03
        	LCDtimeoutOptions << ["4"  : "4 Secunden"]       			//0x04
		LCDtimeoutOptions << ["5"  : "5 Secunden"]       			//0x05
        	LCDtimeoutOptions << ["6"  : "6 Secunden"]       			//0x06
        	LCDtimeoutOptions << ["7"  : "7 Secunden"]       			//0x07
        	LCDtimeoutOptions << ["8"  : "8 Secunden"]       			//0x08
       		LCDtimeoutOptions << ["9"  : "9 Secunden"]       			//0x09
		LCDtimeoutOptions << ["10" : "10 Secunden"]      			//0x0A
        	LCDtimeoutOptions << ["11" : "11 Secunden"]      			//0x0B
        	LCDtimeoutOptions << ["12" : "12 Secunden"]      			//0x0C
        	LCDtimeoutOptions << ["13" : "13 Secunden"]      			//0x0D
        	LCDtimeoutOptions << ["14" : "14 Secunden"]      			//0x0E
		LCDtimeoutOptions << ["15" : "15 Secunden"]      			//0x0F
        	LCDtimeoutOptions << ["16" : "16 Secunden"]      			//0x10
        	LCDtimeoutOptions << ["17" : "17 Secunden"]      			//0x11
        	LCDtimeoutOptions << ["18" : "18 Secunden"]      			//0x12
        	LCDtimeoutOptions << ["19" : "19 Secunden"]      			//0x13
        	LCDtimeoutOptions << ["20" : "20 Secunden"]      			//0x14
		LCDtimeoutOptions << ["21" : "21 Secunden"]      			//0x15
        	LCDtimeoutOptions << ["22" : "22 Secunden"]      			//0x16
        	LCDtimeoutOptions << ["23" : "23 Secunden"]      			//0x17
        	LCDtimeoutOptions << ["24" : "24 Secunden"]      			//0x18
        	LCDtimeoutOptions << ["25" : "25 Secunden"]      			//0x19
        	LCDtimeoutOptions << ["26" : "26 Secunden"]      			//0x1A
        	LCDtimeoutOptions << ["27" : "27 Secunden"]     			//0x1B
        	LCDtimeoutOptions << ["28" : "28 Secunden"]      			//0x1C
        	LCDtimeoutOptions << ["29" : "29 Secunden"]      			//0x1D
        	LCDtimeoutOptions << ["30" : "20 Secunden"]      			//0x1E
				
	def backlightOptions = [:]
		backlightOptions << ["0" : "An"]                 			//0x00
		backlightOptions << ["1" : "Aus"]                			//0x01
				
	def batteryNotOptions = [:]
		batteryNotOptions << ["0" : "Eventgesteuert"]    			//0x00
		batteryNotOptions << ["1" : "1 Mal täglich"]     			//0x01
	
	def tempReportRates = [:]
		tempReportRates << ["0"  : "Temperatur nicht automatisch senden"] 	// 0x00
		tempReportRates << ["1"  : "Temperatur senden bei Differenz von 0.1°C"] // 0x01
		tempReportRates << ["2"  : "Temperatur senden bei Differenz von 0.2°C"] // 0x02
        	tempReportRates << ["3"  : "Temperatur senden bei Differenz von 0.3°C"] // 0x03
        	tempReportRates << ["4"  : "Temperatur senden bei Differenz von 0.4°C"] // 0x04
        	tempReportRates << ["5"  : "Temperatur senden bei Differenz von 0.5°C"] // 0x05
        	tempReportRates << ["6"  : "Temperatur senden bei Differenz von 0.6°C"] // 0x06
        	tempReportRates << ["7"  : "Temperatur senden bei Differenz von 0.7°C"] // 0x07
		tempReportRates << ["8"  : "Temperatur senden bei Differenz von 0.8°C"] // 0x08
        	tempReportRates << ["9"  : "Temperatur senden bei Differenz von 0.9°C"] // 0x09
		tempReportRates << ["10" : "Temperatur senden bei Differenz von 1.0°C"] // 0x0A
        	tempReportRates << ["11" : "Temperatur senden bei Differenz von 1.1°C"] // 0x0B
        	tempReportRates << ["12" : "Temperatur senden bei Differenz von 1.2°C"] // 0x0C
        	tempReportRates << ["13" : "Temperatur senden bei Differenz von 1.3°C"] // 0x0D
        	tempReportRates << ["14" : "Temperatur senden bei Differenz von 1.4°C"] // 0x0E
		tempReportRates << ["15" : "Temperatur senden bei Differenz von 1.5°C"] // 0x0F
       		tempReportRates << ["16" : "Temperatur senden bei Differenz von 1.6°C"] // 0x10
        	tempReportRates << ["17" : "Temperatur senden bei Differenz von 1.7°C"] // 0x11
        	tempReportRates << ["18" : "Temperatur senden bei Differenz von 1.8°C"] // 0x12
        	tempReportRates << ["19" : "Temperatur senden bei Differenz von 1.9°C"] // 0x13
		tempReportRates << ["20" : "Temperatur senden bei Differenz von 2.0°C"] // 0x14
        	tempReportRates << ["21" : "Temperatur senden bei Differenz von 2.1°C"] // 0x15
        	tempReportRates << ["22" : "Temperatur senden bei Differenz von 2.2°C"] // 0x16
        	tempReportRates << ["23" : "Temperatur senden bei Differenz von 2.3°C"] // 0x17
        	tempReportRates << ["24" : "Temperatur senden bei Differenz von 2.4°C"] // 0x18
        	tempReportRates << ["25" : "Temperatur senden bei Differenz von 2.5°C"] // 0x19
        	tempReportRates << ["26" : "Temperatur senden bei Differenz von 2.6°C"] // 0x1A
        	tempReportRates << ["27" : "Temperatur senden bei Differenz von 2.7°C"] // 0x1B
        	tempReportRates << ["28" : "Temperatur senden bei Differenz von 2.8°C"] // 0x1C
        	tempReportRates << ["29" : "Temperatur senden bei Differenz von 2.9°C"] // 0x1D
		tempReportRates << ["30" : "Temperatur senden bei Differenz von 3.0°C"] // 0x1E
        	tempReportRates << ["31" : "Temperatur senden bei Differenz von 3.1°C"] // 0x1F
        	tempReportRates << ["32" : "Temperatur senden bei Differenz von 3.2°C"] // 0x20
        	tempReportRates << ["33" : "Temperatur senden bei Differenz von 3.3°C"] // 0x21
        	tempReportRates << ["34" : "Temperatur senden bei Differenz von 3.4°C"] // 0x22
        	tempReportRates << ["35" : "Temperatur senden bei Differenz von 3.5°C"] // 0x23
        	tempReportRates << ["36" : "Temperatur senden bei Differenz von 3.6°C"] // 0x24
        	tempReportRates << ["37" : "Temperatur senden bei Differenz von 3.7°C"] // 0x25
        	tempReportRates << ["38" : "Temperatur senden bei Differenz von 3.8°C"] // 0x26
        	tempReportRates << ["39" : "Temperatur senden bei Differenz von 3.9°C"] // 0x27
        	tempReportRates << ["40" : "Temperatur senden bei Differenz von 4.0°C"] // 0x28
        	tempReportRates << ["41" : "Temperatur senden bei Differenz von 4.1°C"] // 0x29
        	tempReportRates << ["42" : "Temperatur senden bei Differenz von 4.2°C"] // 0x2A
        	tempReportRates << ["43" : "Temperatur senden bei Differenz von 4.3°C"] // 0x2B
        	tempReportRates << ["44" : "Temperatur senden bei Differenz von 4.4°C"] // 0x2C
        	tempReportRates << ["45" : "Temperatur senden bei Differenz von 4.5°C"] // 0x2D
        	tempReportRates << ["46" : "Temperatur senden bei Differenz von 4.6°C"] // 0x2E
        	tempReportRates << ["47" : "Temperatur senden bei Differenz von 4.7°C"] // 0x2F
        	tempReportRates << ["48" : "Temperatur senden bei Differenz von 4.8°C"] // 0x30
       		tempReportRates << ["49" : "Temperatur senden bei Differenz von 4.9°C"] // 0x31
		tempReportRates << ["50" : "Temperatur senden bei Differenz von 5.0°C"] // 0x32
    
    	def valveReportRates = [:] 
		valveReportRates << ["0"  : "Deaktiviert"] 				// 0x00
		valveReportRates << ["1"  : "Report 1% valve movement"] 		// 0x01
		valveReportRates << ["2"  : "Report 2% valve movement"]			// 0x02
		valveReportRates << ["5"  : "Report 5% valve movement"] 		// 0x32
		valveReportRates << ["10" : "Report 10% valve movement"] 		// 0x0A
		valveReportRates << ["20" : "Report 20% valve movement"] 		// 0x14
		valveReportRates << ["30" : "Report 30% valve movement"] 		// 0x1E
		valveReportRates << ["50" : "Report 50% valve movement"] 		// 0x32
    
	def windowDetectOptions = [:]
		windowDetectOptions << ["0" : "Deaktiviert"] 				// 0x00
		windowDetectOptions << ["1" : "Empfindlichkeit niedrig"]      		// 0x01
		windowDetectOptions << ["2" : "Empfindlichkeit mittel"]   		// 0x02
		windowDetectOptions << ["3" : "Empfindlichkeit hoch"]     		// 0x03
				
	def tempOffset = [:]
        	tempOffset << ["-50" : "Temperaturkorrektur um -5.0°C"]			//0xCE
        	tempOffset << ["-49" : "Temperaturkorrektur um -4.9°C"]			//0xCF
        	tempOffset << ["-48" : "Temperaturkorrektur um -4.8°C"]			//0xD0
        	tempOffset << ["-47" : "Temperaturkorrektur um -4.7°C"]			//0xD1
        	tempOffset << ["-46" : "Temperaturkorrektur um -4.6°C"]			//0xD2
        	tempOffset << ["-45" : "Temperaturkorrektur um -4.5°C"]			//0xD3
        	tempOffset << ["-44" : "Temperaturkorrektur um -4.4°C"]			//0xD4
        	tempOffset << ["-43" : "Temperaturkorrektur um -4.3°C"]			//0xD5
        	tempOffset << ["-42" : "Temperaturkorrektur um -4.2°C"]			//0xD6
        	tempOffset << ["-41" : "Temperaturkorrektur um -4.1°C"]			//0xD7
        	tempOffset << ["-40" : "Temperaturkorrektur um -4.0°C"]			//0xD8
        	tempOffset << ["-39" : "Temperaturkorrektur um -3.9°C"]			//0xD9
        	tempOffset << ["-38" : "Temperaturkorrektur um -3.8°C"]			//0xDA
        	tempOffset << ["-37" : "Temperaturkorrektur um -3.7°C"]			//0xDB
        	tempOffset << ["-36" : "Temperaturkorrektur um -3.6°C"]			//0xDC
        	tempOffset << ["-35" : "Temperaturkorrektur um -3.5°C"]			//0xDD
        	tempOffset << ["-34" : "Temperaturkorrektur um -3.4°C"]			//0xDE
        	tempOffset << ["-33" : "Temperaturkorrektur um -3.3°C"]			//0xDF
        	tempOffset << ["-32" : "Temperaturkorrektur um -3.2°C"]			//0xE0
        	tempOffset << ["-31" : "Temperaturkorrektur um -3.1°C"]			//0xE1
        	tempOffset << ["-30" : "Temperaturkorrektur um -3.0°C"]			//0xE2
        	tempOffset << ["-29" : "Temperaturkorrektur um -2.9°C"]			//0xE3
        	tempOffset << ["-28" : "Temperaturkorrektur um -2.8°C"]			//0xE4
        	tempOffset << ["-27" : "Temperaturkorrektur um -2.7°C"]			//0xE5
        	tempOffset << ["-26" : "Temperaturkorrektur um -2.6°C"]			//0xE6
        	tempOffset << ["-25" : "Temperaturkorrektur um -2.5°C"]			//0xE7
        	tempOffset << ["-24" : "Temperaturkorrektur um -2.4°C"]			//0xE8
        	tempOffset << ["-23" : "Temperaturkorrektur um -2.3°C"]			//0xE9
        	tempOffset << ["-22" : "Temperaturkorrektur um -2.2°C"]			//0xEA
        	tempOffset << ["-21" : "Temperaturkorrektur um -2.1°C"]			//0xEB
        	tempOffset << ["-20" : "Temperaturkorrektur um -2.0°C"]			//0xEC
        	tempOffset << ["-19" : "Temperaturkorrektur um -1.9°C"]			//0xED
        	tempOffset << ["-18" : "Temperaturkorrektur um -1.8°C"]			//0xEE
        	tempOffset << ["-17" : "Temperaturkorrektur um -1.7°C"]			//0xEF
        	tempOffset << ["-16" : "Temperaturkorrektur um -1.6°C"]			//0xF0
        	tempOffset << ["-15" : "Temperaturkorrektur um -1.5°C"]			//0xF1
        	tempOffset << ["-14" : "Temperaturkorrektur um -1.4°C"]			//0xF2
        	tempOffset << ["-13" : "Temperaturkorrektur um -1.3°C"]			//0xF3
        	tempOffset << ["-12" : "Temperaturkorrektur um -1.2°C"]			//0xF4
        	tempOffset << ["-11" : "Temperaturkorrektur um -1.1°C"]			//0xF5
        	tempOffset << ["-10" : "Temperaturkorrektur um -1.0°C"]			//0xF6
        	tempOffset << ["-9"  : "Temperaturkorrektur um -0.9°C"]			//0xF7
        	tempOffset << ["-8"  : "Temperaturkorrektur um -0.8°C"]			//0xF8
        	tempOffset << ["-7"  : "Temperaturkorrektur um -0.7°C"]			//0xF9
        	tempOffset << ["-6"  : "Temperaturkorrektur um -0.6°C"]			//0xFA
        	tempOffset << ["-5"  : "Temperaturkorrektur um -0.5°C"]			//0xFB
        	tempOffset << ["-4"  : "Temperaturkorrektur um -0.4°C"]			//0xFC
       		tempOffset << ["-3"  : "Temperaturkorrektur um -0.3°C"]			//0xFD
        	tempOffset << ["-2"  : "Temperaturkorrektur um -0.2°C"]			//0xFE
        	tempOffset << ["-1"  : "Temperaturkorrektur um -0.1°C"]			//0xFF
        	tempOffset << ["0"   : "Keine Korrektur"]              			//0x00
    		tempOffset << ["1"   : "Temperaturkorrektur um 0.1°C"]			//0x01
    		tempOffset << ["2"   : "Temperaturkorrektur um 0.2°C"]			//0x02
    		tempOffset << ["3"   : "Temperaturkorrektur um 0.3°C"]			//0x03
    		tempOffset << ["4"   : "Temperaturkorrektur um 0.4°C"]			//0x04
    		tempOffset << ["5"   : "Temperaturkorrektur um 0.5°C"]			//0x05
    		tempOffset << ["6"   : "Temperaturkorrektur um 0.6°C"]			//0x06
    		tempOffset << ["7"   : "Temperaturkorrektur um 0.7°C"]			//0x07
    		tempOffset << ["8"   : "Temperaturkorrektur um 0.8°C"]			//0x08
    		tempOffset << ["9"   : "Temperaturkorrektur um 0.9°C"]			//0x09
    		tempOffset << ["10"  : "Temperaturkorrektur um 1.0°C"]			//0x0A
    		tempOffset << ["11"  : "Temperaturkorrektur um 1.1°C"]			//0x0B
    		tempOffset << ["12"  : "Temperaturkorrektur um 1.2°C"]			//0x0C
    		tempOffset << ["13"  : "Temperaturkorrektur um 1.3°C"]			//0x0D
    		tempOffset << ["15"  : "Temperaturkorrektur um 1.5°C"]			//0x0E
    		tempOffset << ["16"  : "Temperaturkorrektur um 1.6°C"]			//0x0F
    		tempOffset << ["17"  : "Temperaturkorrektur um 1.7°C"]			//0x10
    		tempOffset << ["18"  : "Temperaturkorrektur um 1.8°C"]			//0x11
    		tempOffset << ["19"  : "Temperaturkorrektur um 1.9°C"]			//0x12
    		tempOffset << ["20"  : "Temperaturkorrektur um 2.0°C"]			//0x13
    tempOffset//0x14
    tempOffset//0x15
    tempOffset//0x16
    tempOffset//0x17
    tempOffset//0x18
    tempOffset//0x19
    tempOffset//0x1A
    tempOffset//0x1B
    tempOffset//0x1C
    tempOffset//0x1D
    tempOffset//0x1E
    tempOffset//0x1F
    tempOffset//0x20
    tempOffset//0x21
    tempOffset//0x22
    tempOffset//0x23
    tempOffset//0x24
    tempOffset//0x25
    tempOffset//0x26
    tempOffset//0x27
    tempOffset//0x28
    tempOffset//0x29
    tempOffset//0x2A
    tempOffset//0x2B
    tempOffset//0x2C
    tempOffset//0x2D
    tempOffset//0x2E
    tempOffset//0x2F
    tempOffset//0x30
    tempOffset//0x31
    tempOffset//0x32
    
    	preferences {
		input "LCDinvert",        "enum", title: "Display invertieren?",               options: LCDinvertOptions,    description: "Default: Nein",                    required: false, displayDuringSetup: true
		input "LCDtimeout",       "enum", title: "Display ausschalten?",               options: LCDtimeoutOptions,   description: "Default: Immer an",                required: false, displayDuringSetup: true
		input "backlight",        "enum", title: "Hitergrundbeleuchtung",              options: backlightOptions,    description: "Default: Deaktiviert",             required: false, displayDuringSetup: true
		input "battNotification", "enum", title: "Batteryabfrage",                     options: batteryNotOptions,   description: "Default: 1 mal täglich",           required: false, displayDuringSetup: true 
		input "tempReport",       "enum", title: "Meldung bei Temperaturdifferenz",    options: tempReportRates,     description: "Default: Temperatur nicht melden", required: false, displayDuringSetup: true
		input "valveReport",      "enum", title: "Meldung bei Valvedifferenz",         options: valveReportRates,    description: "Default: Deaktiviert",             required: false, displayDuringSetup: true
		input "windowOpen",       "enum", title: "Fensteroffnungserkennung",           options: windowDetectOptions, description: "Default: Empfindlichkeit mittel",  required: false, displayDuringSetup: true
		input "tempOffset",       "enum", title: "Temperature offset",                 options: tempOffset,          description: "Default: Keine Korrektur",         required: false, displayDuringSetup: true
	}
}

def parse(String description) {
	def result = []
	if (description.startsWith("Err")) {
		result = createEvent(descriptionText: description, isStateChange: true)
	} else {
		def cmd = zwave.parse(description)
		if (cmd) { 
            		result += zwaveEvent(cmd) 
        	} else { 
            		log.debug "Non-parsed event: ${description}" 
        	}
    	}
	return result
}

installed () {
	def cmd = []
	cmd << zwave.associationV2.associationGet()					//0x85:0x02
	cmd << zwave.associationV2.associationGroupingsGet()				//0x85:0x05
	cmd << zwave.associationV2.associationSpecificGroupGet()			//0x85:0x0B
 	cmd << zwave.associationGrpInfoV1.associationGroupNameGet()			//0x59:0x01 Short groupingIdentifier
	cmd << zwave.associationGrpInfoV1.associationGroupInfoGet()			//0x59:0x03 Short groupingIdentifier, Boolean listMode, Boolean refreshCache
	cmd << zwave.associationGrpInfoV1.associationGroupCommandListGet()		//0x59:0x05 Boolean allowCache, Short groupingIdentifier
	cmd << zwave.basicV1.basicGet()							//0x20:0x02
	cmd << zwave.batteryV1.batteryGet()						//0x80:0x02
	cmd << zwave.configurationV1.configurationGet(parameterNumber:1)		//0x70:0x05
	cmd << zwave.configurationV1.configurationGet(parameterNumber:2)		//0x70:0x05
	cmd << zwave.configurationV1.configurationGet(parameterNumber:3)		//0x70:0x05
	cmd << zwave.configurationV1.configurationGet(parameterNumber:4)		//0x70:0x05
	cmd << zwave.configurationV1.configurationGet(parameterNumber:5)		//0x70:0x05
	cmd << zwave.configurationV1.configurationGet(parameterNumber:6)		//0x70:0x05
	cmd << zwave.configurationV1.configurationGet(parameterNumber:7)		//0x70:0x05
	cmd << zwave.configurationV1.configurationGet(parameterNumber:8)		//0x70:0x05
	cmd << zwave.manufacturerSpecificV1.manufacturerSpecificGet()			//0x72:0x04
	cmd << zwave.notificationV8.eventSupportedGet(notificationType:8)		//0x71:0x01
	cmd << zwave.notificationV8.eventSupportedGet(notificationType:9)		//0x71:0x01
	cmd << zwave.protectionV1.protectionGet()					//0x75:0x02
	cmd << zwave.sensorMultiLevelV3.sensorMultilevelGet()				//0x31:0x04
	cmd << zwave.switchMultiLevelV1.switchMultilevelGet()				//0x26:0x02
	cmd << zwave.thermostatModeV2.thermostatModeGet()				//0x40:0x02
	cmd << zwave.thermostatModeV2.thermostatModeSupportedGet()			//0x40:0x04
	cmd << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType:11)	//0x43:0x02
	cmd << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType:1)		//0x43:0x02
	cmd << zwave.securityV1.securityCommandsSupportedGet()				//0x98:0x02
	cmd << zwave.versionV2.versionGet()						//0x86:0x11
	cmd << zwave.zwaveplusInfoV2.zwaveplusInfoGet()					//0x5E:0x01
	secureSequence(cmd)
}

//AssociationV2
//Command Class: 0x85
//Command: 0x01
def zwaveEvent(hubitat.zwave.commands.associationv2.AssociationSet cmd){
    //Short groupingIdentifier
    //Object nodeId
}
//Command: 0x03
def zwaveEvent(hubitat.zwave.commands.associationv2.AssociationReport cmd) {
     //Short groupingIdentifier
     //Short maxNodesSupported
     //Short reportsToFollow 
}
//Command: 0x04
def zwaveEvent(hubitat.zwave.commands.associationv2.AssociationRemove cmd) {
     //Short groupingIdentifier
     //Object nodeId 
}
//Command: 0x06
def zwaveEvent(hubitat.zwave.commands.associationv2.AssociationGroupingsReport cmd) {
     //Short supportedGroupings 
}
//Command: 0x0C
def zwaveEvent(hubitat.zwave.commands.associationv2.AssociationSpecificGroupReport cmd) {
     //Short group
}

//Association Grp Info V1
//Command Class: 0x59
//Command: 0x02
def zwaveEvent(hubitat.zwave.commands.associationgrpinfov1.AssociationGroupNameReport cmd) {
     //Short groupingIdentifier
     //Short lengthOfName
     //List<AssociationGroupNameReport> name
}
//Command: 0x04
def zwaveEvent(hubitat.zwave.commands.associationgrpinfov1.AssociationGroupInfoReport cmd) {
     //Boolean dynamicInfo
     //Short groupCount
     //List<AssociationGroupInfoReport> groupInfo
     //Boolean listMode
}
//Command: 0x06
def zwaveEvent(hubitat.zwave.commands.associationgrpinfov1.AssociationGroupCommandListReport cmd) {
     //List<AssociationGroupCommandListReport> command
     //Short groupingIdentifier
     //Short listLength
}

//Basic V1
//Command Class: 0x20
//Command: 0x01
def zwaveEvent(hubitat.zwave.commands.basicv1.BasicSet cmd) {
     //Short value
}
def zwaveEvent(hubitat.zwave.commands.basicv1.BasicReport cmd) {
	//Short value
	def event = [ ]
	if (cmd.value == 0xFF) {
        	state.thermostatMode = "heat"        
    	}
	if (cmd.value == 0xF0) {
        	state.thermostatMode = "fullPowerHeat" 
        }
	if (cmd.value == 0x00) { 
        	state.thermostatMode = "energySaveHeat" 
    	}
	if (cmd.value == 0x0F) { 
        	state.thermostatMode = "off"  
        }
	if (cmd.value == 0xFE) { 
        	state.thermostatMode = "manufacturerSpecific"	
        }
	event << createEvent(name: "thermostatMode", value: state.thermostatMode, displayed: true)
    	log.info "Report Received : ${cmd}, ${state.thermostatMode}, ${state.thermostatOperatingState}"
	return event
}

//Battery V1
//Command Class: 0x80
//Command: 0x03
def zwaveEvent(hubitat.zwave.commands.batteryv1.BatteryReport cmd) {
	state.lastBatteryReportReceivedAt = new Date().time // Store time of last battery
	createEvent(name: "battery", unit:"%", value: cmd.batteryLevel, isStateChange: true)
}

//Configuration V1
//Command Class: 0x70
//Command: 0x04
def zwaveEvent(hubitat.zwave.commands.configurationv1.ConfigurationSet cmd) {
     //List<ConfigurationSet> configurationValue
     //Boolean defaultValue
     //Short parameterNumber
     //Short reserved11
     //BigInteger scaledConfigurationValue
     //Short size
}
//Command: 0x06
def zwaveEvent(hubitat.zwave.commands.configurationv1.ConfigurationReport cmd) {
     //List<ConfigurationReport> configurationValue
     //Short parameterNumber
     //BigInteger scaledConfigurationValue
     //Short size
}

//Device Reset Locally V1
//Command Class: 0x5A
//Command: 0x01
def zwaveEvent(hubitat.zwave.commands.deviceresetlocallyv1.DeviceResetLocallyNotification cmd) {
}

//Manufacturer Specific V1
//Command Class: 0x72
//Command: 0x05
def zwaveEvent(hubitat.zwave.commands.manufacturerspecificv1.ManufacturerSpecificReport cmd) {
     //Integer manufacturerId
     //String manufacturerName
     //Integer productId
     //Integer productTypeId
}

//Notification V8
//Command Class: 0x71
//Command: 0x02
def zwaveEvent(hubitat.zwave.commands.notificationv8.EventSupportedReport cmd) {
     //Short notificationType
     //Map supportedEvents
}
//Command: 0x05
def zwaveEvent(hubitat.zwave.commands.notificationv8.NotificationReport cmd) {
     //Short event
     //Short eventParametersLength
     //Short notificationStatus
     //Short notificationType
     //Short reserved
     //Boolean sequence
     //Short v1AlarmLevel
     //Short v1AlarmType
     //static Short NOTIFICATION_TYPE_POWER_MANAGEMENT = 8
     //static Short NOTIFICATION_TYPE_SYSTEM = 9
}
//Command: 0x06
def zwaveEvent(hubitat.zwave.commands.notificationv8.NotificationSet cmd) {
     //Short notificationStatus
     //Short notificationType
     //static Short NOTIFICATION_TYPE_POWER_MANAGEMENT = 8
     //static Short NOTIFICATION_TYPE_SYSTEM = 9
}


//Protection V1
//Command Class: 0x75
//Command: 0x01
def zwaveEvent(hubitat.zwave.commands.protectionv1.ProtectionSet cmd) {
     //Short protectionState
     //static Short PROTECTION_STATE_NO_OPERATION_POSSIBLE = 2
     //static Short PROTECTION_STATE_PROTECTION_BY_SEQUENCE = 1
     //static Short PROTECTION_STATE_UNPROTECTED = 0
}
def zwaveEvent(hubitat.zwave.commands.protectionv1.ProtectionReport cmd) {     
	def eventValue = ""
	if (cmd.protectionState == 0) { eventValue = "unlocked" }
	if (cmd.protectionState == 1) { eventValue = "locked" }
	createEvent(name: "lock", value: eventValue, displayed: true)	
}

//Sensor Multilevel V3
//Command Class: 0x31
//Command: 0x05
def zwaveEvent(hubitat.zwave.commands.sensormultilevelv3.SensorMultilevelReport cmd) {
     //Short precision
     //Short scale
     //BigDecimal scaledSensorValue
     //Short sensorType
     //Short size
     //static Short SENSOR_TYPE_TEMPERATURE_VERSION_1 = 1
}

//Switch Multilevel V1
//Command Class: 0x26
//Command: 0x01
def zwaveEvent(hubitat.zwave.commands.switchmultilevelv1.SwitchMultilevelSet cmd) {
     //Short value
}
//Command: 0x03
def zwaveEvent(hubitat.zwave.commands.switchmultilevelv1.SwitchMultilevelReport cmd) {
	createEvent(name:"level", value: cmd.value, unit:"%", displayed: true)
}
    
//Thermostat Mode V2
//Command Class: 0x40
//Command: 0x01
def zwaveEvent(hubitat.zwave.commands.thermostatmodev2.ThermostatModeSet cmd) {
     //Short mode
     //static Short MODE_ENERGY_SAVE_HEAT = 11
     //static Short MODE_HEAT = 1
     //static Short MODE_OFF = 0
     //static Short FULL_POWER = 0x0F
     //static Short MANUFACTURER_SPECIFIC = 0x1F
}
//Command: 0x03
def zwaveEvent(hubitat.zwave.commands.thermostatmodev2.ThermostatModeReport cmd) {
     //Short mode
     //static Short MODE_ENERGY_SAVE_HEAT = 11
     //static Short MODE_HEAT = 1
     //static Short MODE_OFF = 0
     //static Short FULL_POWER = 0x0F
     //static Short MANUFACTURER_SPECIFIC = 0x1F
}
//Command: 0x05
def zwaveEvent(hubitat.zwave.commands.thermostatmodev2.ThermostatModeSupportedReport cmd) {
     //Boolean energySaveHeat
     //Boolean heat
     //Boolean off
}    
    
//Thermostat Setpoint V2
//Command Class: 0x43
//Command: 0x01
def zwaveEvent(hubitat.zwave.commands.thermostatsetpointv2.ThermostatSetpointSet cmd) {
     //Short precision
     //Short scale
     //BigDecimal scaledValue
     //Short setpointType
     //Short size
     //static Short SETPOINT_TYPE_ENERGY_SAVE_HEATING = 11
     //static Short SETPOINT_TYPE_HEATING_1 = 1
}
//Command: 0x03
def zwaveEvent(hubitat.zwave.commands.thermostatsetpointv2.ThermostatSetpointReport cmd) {
     //Short precision
     //Short scale
     //BigDecimal scaledValue
     //Short setpointType
     //Short size
     //static Short SETPOINT_TYPE_ENERGY_SAVE_HEATING = 11
     //static Short SETPOINT_TYPE_HEATING_1 = 1
}

    
//Security V1
//Command Class: 0x98
//Command: 0x03
def zwaveEvent(hubitat.zwave.commands.securityv1.SecurityCommandsSupportedReport cmd) {
     //List<SecurityCommandsSupportedReport> commandClassControl
     //List<SecurityCommandsSupportedReport> commandClassSupport
     //Short reportsToFollow
}
//Command: 0x81
def zwaveEvent(hubitat.zwave.commands.securityv1.SecurityMessageEncapsulation cmd) {
     //List<SecurityMessageEncapsulation> commandByte
     //Short commandClassIdentifier
     //Short commandIdentifier
     //Boolean secondFrame
     //Short sequenceCounter
     //Boolean sequenced
     	def encapsulatedCommand = cmd.encapsulatedCommand ([0x20:0x03,0x43:0x02,0x98:0x02,0x86:0x11,0x5E:0x01,0x85:0x02,0x85:0x05,0x85:0x0B,0x59:0x01,0x59:0x03,0x59:0x05,
							    0x20:0x02,0x80:0x02,0x70:0x05,0x72:0x04,0x71:0x01,0x75:0x02,0x31:0x04,0x26:0x02,0x40:0x02,0x40:0x04]) 
	if (encapsulatedCommand) {
		return zwaveEvent(encapsulatedCommand)
	} else {
    	createEvent(descriptionText: cmd.toString())
	}
}

    
//Version V2
//Command Class: 0x86
//Command: 0x12
def zwaveEvent(hubitat.zwave.commands.versionv2.VersionReport cmd) {
     //Short applicationSubVersion
     //Short applicationVersion
     //Short firmware0SubVersion
     //Short firmware0Version
     //Short firmwareTargets
     //Short hardwareVersion
     //List<VersionReport> targetVersions
     //Short zWaveLibraryType
     //Short zWaveProtocolSubVersion
     //Short zWaveProtocolVersion
}

//Zwaveplus Info V2
//Command Class: 0x5E
//Command: 0x02
def zwaveEvent(hubitat.zwave.commands.zwaveplusinfov2.ZwaveplusInfoReport cmd) {
     //Long installerIconType
     //Long userIconType
     //Short zWaveplusNodeType
     //Short zWaveplusRoleType
     //Short zWaveplusVersion
}
    
    













def zwaveEvent(hubitat.zwave.commands.sensormultilevelv5.SensorMultilevelReport cmd) {
	def map = [ value: cmd.scaledSensorValue.toString(), displayed: true ]
	map.name = "temperature"
	map.unit = cmd.scale == 1 ? "F" : "C"
	state.temperature = cmd.scaledSensorValue
    def aktuell = state.thermostatMode == "heat" ? state.heatingSetpoint : state.coolingSetpoint 
    if ((state.temperature < aktuell) && (state.thermostateMode != "manual" || state.thermostateMode != "off" || state.thermostateMode != "emergency heat" )) {
        sendEvent(name: "thermostatOperatingState", value: "heating", displayed: true)
    } else if ((state.temperature < aktuell) && (state.thermostateMode != "manual" || state.thermostateMode != "off" || state.thermostateMode != "emergency heat" )) {
        sendEvent(name: "thermostatOperatingState", value: "idle", displayed: true)
    }
	log.info "Report Received : $cmd"
	createEvent(map)
}

def zwaveEvent(hubitat.zwave.commands.thermostatsetpointv2.ThermostatSetpointReport cmd) { //	Parsed ThermostatSetpointReport(precision: 2, reserved01: 0, scale: 0, scaledValue: 21.00, setpointType: 1, size: 2, value: [8, 52])
	def event = []
	state.scale = cmd.scale	
	state.precision = cmd.precision
	def radiatorSetPoint = cmd.scaledValue
	if (cmd.setpointType == 1) { 
        event << createEvent(name: "heatingSetpoint", value: radiatorSetPoint.toString(), unit: getTemperatureScale(), displayed: true)
        state.heatingSetpoint = radiatorSetpoint.toFloat()
    }
	if (cmd.setpointType == 11) { 
        event << createEvent(name: "coolingSetpoint", value: radiatorSetPoint.toString(), unit: getTemperatureScale(), displayed: true)
        state.coolingSetpoint = radiatorSetpoint.toFloat()
    }
	log.info "Report Received : ${cmd}"
	return event
}



def zwaveEvent(hubitat.zwave.commands.thermostatmodev2.ThermostatModeReport cmd ) {
    def event = []
    def tm = "heat"
	if (cmd.mode == 1) { 
        state.thermostatMode = tm = "heat" 
    }
	if (cmd.mode == 15) { 
        state.thermostatMode = tm = "emergency heat" 
        state.thermostatOperatingState = "pending heat" 
    }
	if (cmd.mode == 11) { 
        state.thermostatMode = tm = "cool" 
    }
	if (cmd.mode == 0) { 
        tm = "off" 
        state.thermostatOperatingState = "idle"
		if (state.thermostatModeBoost) {thermostatModeHeat()}
    }
	if (cmd.mode == 31) { 
        state.thermostatMode = tm = "manual" 
        state.thermostatOperatingState = "vent economizer" 
    }
	event << createEvent(name: "thermostatMode", value: tm, displayed: true)
    event << createEvent(name: "thermostatOperatingState", value: state.thermostatOperatingState, displayed: true)
	log.info "Report Received : ${cmd}, ${state.thermostatMode}, ${state.thermostatOperatingState}"
	return event
}

def zwaveEvent(hubitat.zwave.commands.thermostatmodev2.ThermostatModeSupportedReport cmd) {
	log.trace "$cmd"
	def supportedModes = []
	supportedModes << "off"
	supportedModes << "heat" 
	supportedModes << "cool" 
	supportedModes << "emergency heat" 
	supportedModes << "manual"
    state.supportedModes = supportedModes 
	sendEvent(name: "supportedThermostatModes", value: supportedModes, displayed: false)
	log.info "Report Received : $cmd, Thermostat supported modes : $supportedModes"
}

def zwaveEvent(hubitat.zwave.commands.notificationv3.NotificationReport cmd) {
	def events = []
	switch (cmd.notificationType) {
		case 8:
			def descriptionText
			if (cmd.eventParameter == []) { descriptionText = "New batteries" }
            else { 
                if (cmd.eventParameter == [10]) { descriptionText = "replace battery soon"}
				if (cmd.eventParameter == [11]) { descriptionText = "replace battery now" }
			}
			sendPush("${device.displayName}: Warning! $descriptionText")
			sendEvent(name: "NotificationCC_Power", value: descriptionText, displayed: false)			
			log.info "Power management event: Warning! $descriptionText"
			break;
		case 9:
			def descriptionText
			if (cmd.eventParameter == []) {
				descriptionText = "Cleared"
			} else {
				if (cmd.eventParameter == [1]) { descriptionText = "Warning! Motor movement not possible" }
				if (cmd.eventParameter == [2]) { descriptionText = "Warning! Not mounted on a valve" }
				if (cmd.eventParameter == [3]) { descriptionText = "Warning! Valve closing point could not be detected" }
				if (cmd.eventParameter == [4]) { descriptionText = "Warning! Piston positioning failed"	}
			}
			sendPush("${device.displayName}: $descriptionText")
            sendEvent(name: "NotificationCC_System", value: descriptionText, displayed: false)
			log.info "System event: $descriptionText"
			break;
	}
	log.info "Notification Report : $cmd"
}

def zwaveEvent(hubitat.zwave.commands.associationv2.AssociationReport cmd) {
	def result = []
	if (cmd.nodeId.any { it == zwaveHubNodeId }) {
		result << sendEvent(descriptionText: "$device.displayName is associated in group ${cmd.groupingIdentifier}")
	} else if (cmd.groupingIdentifier == 1) {
		result << sendEvent(descriptionText: "Associating $device.displayName in group ${cmd.groupingIdentifier}")
		result << response(zwave.associationV1.associationSet(groupingIdentifier:cmd.groupingIdentifier, nodeId:zwaveHubNodeId))
	}
	log.info "Report Received : $cmd"
	result
}

def zwaveEvent(hubitat.zwave.Command cmd) {
	def map = [ descriptionText: "${device.displayName}: ${cmd}" ]
	log.warn "mics zwave.Command - ${device.displayName} - $cmd"
	sendEvent(map)
}

def zwaveEvent(hubitat.zwave.commands.manufacturerspecificv2.ManufacturerSpecificReport cmd) {
	if (cmd.manufacturerName) { updateDataValue("manufacturer", cmd.manufacturerName) }
	if (cmd.productTypeId) { updateDataValue("productTypeId", cmd.productTypeId.toString()) }
	if (cmd.productId) { updateDataValue("productId", cmd.productId.toString()) }
	if (cmd.manufacturerId){ updateDataValue("manufacturerId", cmd.manufacturerId.toString()) }
	log.info "Report Received : $cmd"
}

def zwaveEvent(hubitat.zwave.commands.configurationv2.ConfigurationReport cmd ) {
	log.info "Report Received : $cmd"
	def events = []
	switch (cmd.parameterNumber) {
		case 1:
		def setValue
		if (cmd.scaledConfigurationValue == 0) { setValue = "No" }
		if (cmd.scaledConfigurationValue == 1) { setValue = "Yes" }
		log.info "LCDinvert: ${setValue}"
		break;
				
		case 2:
		def setValue
		if (cmd.scaledConfigurationValue == 0) { setValue = "Always on" }
		if (cmd.scaledConfigurationValue == 5) { setValue = "5 Seconds" }
		if (cmd.scaledConfigurationValue == 10) { setValue = "10 Seconds" }
		if (cmd.scaledConfigurationValue == 15) { setValue = "15 Seconds" }
		if (cmd.scaledConfigurationValue == 20) { setValue = "20 Seconds" }
		if (cmd.scaledConfigurationValue == 30) { setValue = "30 Seconds" }
		log.info "LCDtimeout: ${setValue}"
		break;
				
		case 3:
		def setValue
		if (cmd.scaledConfigurationValue == 0) { setValue = "Disabled" }
		if (cmd.scaledConfigurationValue == 1) { setValue = "Enabled" }
		log.info "backlight: ${setValue}"
		break;
				
		case 4:
		def setValue
		if (cmd.scaledConfigurationValue == 0) { setValue = "Event only" }
		if (cmd.scaledConfigurationValue == 1) { setValue = "Once a day" }
		log.info "battery notification: ${setValue}"
		break;
				
		case 5:
		def setValue
		if (cmd.scaledConfigurationValue == 0) { setValue = "Disabled" }
		if (cmd.scaledConfigurationValue == 1) { setValue = "Report 0.1 degree temperature change" }
		if (cmd.scaledConfigurationValue == 2) { setValue = "Report 0.2 degree temperature change" }
		if (cmd.scaledConfigurationValue == 3) { setValue = "Report 0.3 degree temperature change" }
		if (cmd.scaledConfigurationValue == 5) { setValue = "Report 0.5 degree temperature change" }
		if (cmd.scaledConfigurationValue == 8) { setValue = "Report 0.8 degree temperature change" }
		if (cmd.scaledConfigurationValue == 10) { setValue = "Report 1.0 degree temperature change" }
		if (cmd.scaledConfigurationValue == 15) { setValue = "Report 1.5 degree temperature change" }
		if (cmd.scaledConfigurationValue == 20) { setValue = "Report 2.0 degree temperature change" }
		if (cmd.scaledConfigurationValue == 30) { setValue = "Report 3.0 degree temperature change" }
		if (cmd.scaledConfigurationValue == 50) { setValue = "Report 5.0 degree temperature change" }
		log.info "Temp report: ${setValue}"
		break;
				
		case 6:
		def setValue
		if (cmd.scaledConfigurationValue == 0) { setValue = "Disabled" }
		if (cmd.scaledConfigurationValue == 1) { setValue = "Report 1% valve movement" }
		if (cmd.scaledConfigurationValue == 2) { setValue = "Report 2% valve movement" }
		if (cmd.scaledConfigurationValue == 5) { setValue = "Report 5% valve movement" }
		if (cmd.scaledConfigurationValue == 10) { setValue = "Report 10% valve movement" }
		if (cmd.scaledConfigurationValue == 20) { setValue = "Report 20% valve movement" }
		if (cmd.scaledConfigurationValue == 30) { setValue = "Report 30% valve movement" }
		if (cmd.scaledConfigurationValue == 50) { setValue = "Report 50% valve movement" }
		log.info "Valve report: ${setValue}"
		break;
				
		case 7:
		def setValue
		if (cmd.scaledConfigurationValue == 0) { setValue = "Disabled" }
		if (cmd.scaledConfigurationValue == 1) { setValue = "Low" }
		if (cmd.scaledConfigurationValue == 2) { setValue = "Medium" }
		if (cmd.scaledConfigurationValue == 3) { setValue = "High" }
		log.info "Window open detection: ${setValue}"
		break;
				
		case 8:
		def setValue
		setValue = cmd.scaledConfigurationValue
		log.info "Temp offset: ${setValue}"
		break;
	}
}

def zwaveEvent(hubitat.zwave.commands.versionv1.VersionReport cmd) {
	log.debug "$cmd"
	def zWaveLibraryTypeDisp  = String.format("%02X",cmd.zWaveLibraryType)
	def zWaveLibraryTypeDesc  = ""
	switch(cmd.zWaveLibraryType) {
		case 1:
		zWaveLibraryTypeDesc = "Static Controller"
		break

		case 2:
		zWaveLibraryTypeDesc = "Controller"
		break

		case 3:
		zWaveLibraryTypeDesc = "Enhanced Slave"
		break

		case 4:
		zWaveLibraryTypeDesc = "Slave"
		break

		case 5:
		zWaveLibraryTypeDesc = "Installer"
		break

		case 6:
		zWaveLibraryTypeDesc = "Routing Slave"
		break

		case 7:
		zWaveLibraryTypeDesc = "Bridge Controller"
		break

		case 8:
		zWaveLibraryTypeDesc = "Device Under Test (DUT)"
		break

		case 0x0A:
		zWaveLibraryTypeDesc = "AV Remote"
		break

    	case 0x0B:
		zWaveLibraryTypeDesc = "AV Device"
		break

		default:
		zWaveLibraryTypeDesc = "N/A"
	}
	def applicationVersionDisp = String.format("%d.%02d",cmd.applicationVersion,cmd.applicationSubVersion)
	def zWaveProtocolVersionDisp = String.format("%d.%02d",cmd.zWaveProtocolVersion,cmd.zWaveProtocolSubVersion)
	sendEvent([name: "applicationVersion", value:  applicationVersionDisp])
	sendEvent([name: "zWaveLibraryType", value:  zWaveLibraryTypeDesc])
} 

def heatingSetpointUp () {
    def nextTemp = device.currentValue("heatingSetpoint").toBigDecimal() + 0.5
	if(nextTemp > 28) {	nextTemp = 28 }
    delay (10)
	setHeatingSetpoint(nextTemp)
}

def heatingSetpointDown () {
    def nextTemp = device.currentValue("heatingSetpoint").toBigDecimal() - 0.5
	if(nextTemp < 6) {	nextTemp = 6 }
    delay (10)
	setHeatingSetpoint(nextTemp)
}

def setHeatingSetpoint(Double degrees) {
    def cmds = []
	def precision = state.precision ?: 2
	def deviceScale = state.scale ?: 0
    sendEvent(name:"heatingSetpoint", value: degrees, unit: getTemperatureScale(), descriptionText: "Next heating setpoint is ${degrees}", displayed: true, isStateChange:true)
	cmds << zwave.thermostatSetpointV2.thermostatSetpointSet(precision: precision, scale: deviceScale, scaledValue: degrees, setpointType: 1)
	cmds << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 1)		
    secureSequence(cmds)
	log.debug "Executing 'setHeatingSetpoint' '${cmds}'"
}

def coolingSetpointUp() {
    def nextTemp = device.currentValue("coolingSetpoint").toBigDecimal() + 0.5
	if(nextTemp > 28) {	nextTemp = 28 }
    log.trace "coolingSetpointUp sendet $nextTempf an setCoolingSetpoint"
    delay (10)
	setCoolingSetpoint (nextTemp)
}

def coolingSetpointDown() {
    def nextTemp = device.currentValue("coolingSetpoint").toBigDecimal() - 0.5
	if(nextTemp < 6) {	nextTemp = 6 }
    log.trace "coolingSetpointDown sendet $nextTempf an setCoolingSetpoint"
    delay (10)
	setCoolingSetpoint (nextTemp)
}

def setCoolingSetpoint(Double degrees) {
    def cmds = []
	def precision = state.precision ?: 2
	def deviceScale = state.scale ?: 0
    sendEvent(name:"coolingSetpoint", value: degrees, unit: getTemperatureScale(), descriptionText: "Next cooling setpoint is ${degrees}", displayed: true, isStateChange:true)
	cmds << zwave.thermostatSetpointV2.thermostatSetpointSet(precision: precision, scale: deviceScale, scaledValue: degrees, setpointType: 11)
	cmds << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 11)		
    secureSequence(cmds)
	log.debug "Executing 'setCoolingSetpoint' '${cmds}"
	// TODO: handle 'setCoolingSetpoint' command
}

def lock() {
    def cmds = []
	sendEvent(name: "lock", value: "locked", displayed: false)
	cmds << zwave.protectionV1.protectionSet(protectionState: 1)
	cmds << zwave.protectionV1.protectionGet()
	log.trace "lock $cmds" 
	secureSequence(cmds)
}

def unlock() {
    def cmds = []
	sendEvent(name: "lock", value: "unlocked", displayed: false)
	cmds << zwave.protectionV1.protectionSet(protectionState: 0)
	cmds << zwave.protectionV1.protectionGet()
	log.trace "unlock $cmds" 
	secureSequence (cmds)
}

def setLevel(nextLevel) {
    def cmds = []
    sendEvent(name:"level", value: nextLevel, displayed: false, isStateChange:true)
	cmds << zwave.switchMultilevelV3.switchMultilevelSet(value: nextLevel)
	cmds << zwave.switchMultilevelV3.switchMultilevelGet()
	log.trace "Executing 'setLevel' : $cmds"
	secureSequence(cmds)
}

def thermostatModeOff(){
    off()
}

def off() {
    def cmds = []
	state.thermostatModeBoost = false
	sendEvent(name: "thermostatMode", value: "off", displayed: true)
    sendEvent(name: "thermostatOperatingState", value: "idle", displayed: true)
    cmds << zwave.thermostatModeV2.thermostatModeSet(mode: 0)
	cmds << zwave.thermostatModeV2.thermostatModeGet()
	cmds <<	zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 1)
    cmds << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 11)
	secureSequence (cmds)
	log.debug "Executing 'off'"
}

def thermostatModeHeat() {
    heat()
}

def heat() {
    def cmds = []
    state.thermostatMode = "heat"
	state.thermostatModeBoost = 1
    sendEvent(name: "thermostatMode", value: "heat", displayed: true)
    sendEvent(name: "thermostatOperatingState", value: "heating", displayed: true)
    sendEvent(name: "switch", value: "on", displayed: true)
	cmds << zwave.thermostatModeV2.thermostatModeSet(mode: 1)
	cmds << zwave.thermostatModeV2.thermostatModeGet()
	cmds <<	zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 1)
    cmds << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 11)
	secureSequence (cmds)
	log.debug "Executing 'heat' $cmds"
}

def thermostatModeEmergencyHeat () {
    emergencyHeat ()
}

def emergencyHeat() {
    def cmds = []
    state.thermostatModeBoost = true
    sendEvent(name: "thermostatMode", value: "emergency heat", displayed: true)
    sendEvent(name: "thermostatOperatingState", value: "pending heat", displayed: true)
    sendEvent(name: "switch", value: "on", displayed: true)
	cmds << zwave.thermostatModeV2.thermostatModeSet(mode: 0x0F)
	cmds << zwave.thermostatModeV2.thermostatModeGet()
	cmds <<	zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 1)
    cmds << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 11)
	log.debug "Executing 'emergencyHeat' $cmds"
	secureSequence(cmds)
}

def thermostatModeCool() {
    cool()
}

def cool() {
    def cmds = []
    state.thermostatMode = "cool"
	sendEvent(name: "thermostatMode", value: "cool", displayed: true)
    sendEvent(name: "thermostatOperatingState", value: "cooling", displayed: true)
    sendEvent(name: "switch", value: "on", displayed: true)
	cmds << zwave.thermostatModeV2.thermostatModeSet(mode: 0x0B)
	cmds << zwave.thermostatModeV2.thermostatModeGet()
	cmds <<	zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 1)
    cmds << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 11)
	log.debug "Executing 'cool' $cmds"
	secureSequence(cmds)	
}

def thermostatModeManual(){
    manual()
}

def manual() {
    def cmds = []
    state.thermostatMode = state.thermostatMode = "manual"
	sendEvent(name: "thermostatMode", value: "manual", displayed: true)
    sendEvent(name: "thermostatOperatingState", value: "vent economizer", displayed: true)
    sendEvent(name: "switch", value: "on", displayed: true)
	cmds << zwave.thermostatModeV2.thermostatModeSet(mode: 0x1F)
	cmds << zwave.thermostatModeV2.thermostatModeGet()
	cmds <<	zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 1)
    cmds << zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 11)
	secureSequence(cmds)
	log.debug "Executing 'auto' $cmds"
}

def setThermostatMode(String) {
    def nextMode = String
	switch ("$nextMode") {
		case "heat":
		thermostatModeHeat()
		break;

		case "emergency heat":
		thermostatModeEmergencyHeat()
		break;

		case "cool":
		thermostatModeCool()
		break;
		
        case "manual":
        thermostatModeManual()
        break;

        case "off":
		thermostatModeOff()
		break;
	}
	log.debug "Executing 'setThermostatMode' '$nextMode'"
}

def secure(hubitat.zwave.Command cmd) {
	if (state.sec) { return zwave.securityV1.securityMessageEncapsulation().encapsulate(cmd).format() } 
		else { return cmd.format() }
}

def secureSequence(commands, delay=1500) {
    delayBetween(commands.collect{ secure(it) }, delay)
}

def configure() {
	state.supportedModes = ["off", "heat", "emergency heat", "cool", "manual"]
	def cmds = []
	cmds << zwave.configurationV1.configurationSet(configurationValue:  LCDinvert == "1" ? [0x01] : [0x00], parameterNumber:1, size:1, scaledConfigurationValue:  LCDinvert == "1" ? 0x01  : 0x00)
	cmds << zwave.configurationV1.configurationSet(configurationValue:  LCDtimeout == "5" ? [0x05] : LCDtimeout == "10" ? [0x0A] : LCDtimeout == "15" ? [0x0F] : LCDtimeout == "20" ? [0x14] : LCDtimeout == "30" ? [0x1E] : [0x00], parameterNumber:2, size:1, scaledConfigurationValue:  LCDtimeout == "5" ? 0x05 : LCDtimeout == "10" ? 0x0A : LCDtimeout == "15" ? 0x0F : LCDtimeout == "20" ? 0x14 : LCDtimeout == "30" ? 0x1E : 0x00)//,
	cmds << zwave.configurationV1.configurationSet(configurationValue:  backlight == "1" ? [0x01] : [0x00], parameterNumber:3, size:1, scaledConfigurationValue:  backlight == "1" ? 0x01 : 0x00)//
	cmds << zwave.configurationV1.configurationSet(configurationValue:  battNotification == "Event only" ? [0x00] : [0x01], parameterNumber:4, size:1, scaledConfigurationValue:  battNotification == "Event only" ? 0x00 : 0x01) //,
	cmds << zwave.configurationV1.configurationSet(configurationValue:  tempReport == "1" ? [0x01] : tempReport == "2" ? [0x02] : tempReport == "5" ? [0x05] : tempReport == "8" ? [0x08] : tempReport == "10" ? [0x0A] : tempReport == "15" ? [0x0F] : tempReport == "20" ? [0x14] : tempReport == "30" ? [0x1E] : tempReport == "50" ? [0x32] : [0x00], parameterNumber:5, size:1, scaledConfigurationValue:  tempReport == "1" ? 0x01 : tempReport == "2" ? 0x02 : tempReport == "5" ? 0x05 : tempReport == "8" ? 0x08 : tempReport == "10" ? 0x0A : tempReport == "15" ? 0x0F : tempReport == "20" ? 0x14 : tempReport == "30" ? 0x1E : tempReport == "50" ? 0x32 : 0x00)//,
	cmds << zwave.configurationV1.configurationSet(configurationValue:  valveReport == "1" ? [0x01] : valveReport == "2" ? [0x02] : valveReport == "5" ? [0x05] : valveReport == "10" ? [0x0A] : valveReport == "20" ? [0x14] : valveReport == "30" ? [0x1E] : valveReport == "50" ? [0x32] : [0x00], parameterNumber:6, size:1, scaledConfigurationValue:  valveReport == "1" ? 0x01 : valveReport == "2" ? 0x02 : valveReport == "5" ? 0x05 : valveReport == "10" ? 0x0A : valveReport == "20" ? 0x14 : valveReport == "30" ? 0x1E : valveReport == "50" ? 0x32 : 0x00)//,
	cmds << zwave.configurationV1.configurationSet(configurationValue:  windowOpen == "0" ? [0x00] : windowOpen == "1" ? [0x01] : windowOpen == "3" ? [0x03] : [0x02], parameterNumber:7, size:1, scaledConfigurationValue: windowOpen == "0" ? 0x00 : windowOpen == "1" ? 0x01 : windowOpen == "3" ? 0x03 : 0x02)//,	
	cmds << zwave.configurationV1.configurationSet(configurationValue: tempOffset == null ? [0] : [tempOffset*10], parameterNumber:8, size:1, scaledConfigurationValue: tempOffset == null ? 0 : tempOffset*10)//,
	
	cmds << zwave.sensorMultilevelV5.sensorMultilevelGet(sensorType:1, scale:1)     //get temperature
	cmds << zwave.thermostatModeV2.thermostatModeGet()                              //get Mode
	cmds << zwave.thermostatSetpointV1.thermostatSetpointGet(setpointType: 0x01)    //get temp heat
	cmds << zwave.thermostatSetpointV1.thermostatSetpointGet(setpointType: 0x0B)    //get temp eco
	cmds << zwave.switchMultilevelV3.switchMultilevelGet()                          //get valve position
	cmds << zwave.configurationV1.configurationGet(parameterNumber:1)               //get pamam - 1..8
	cmds << zwave.configurationV1.configurationGet(parameterNumber:2)
	cmds << zwave.configurationV1.configurationGet(parameterNumber:3)
	cmds << zwave.configurationV1.configurationGet(parameterNumber:4)
	cmds << zwave.configurationV1.configurationGet(parameterNumber:5)
	cmds << zwave.configurationV1.configurationGet(parameterNumber:6)
	cmds << zwave.configurationV1.configurationGet(parameterNumber:7)
	cmds << zwave.configurationV1.configurationGet(parameterNumber:8)
	cmds << zwave.batteryV1.batteryGet()                                            //get battery stat
	cmds << zwave.protectionV1.protectionGet()                                      //secur
	cmds << zwave.thermostatModeV2.thermostatModeSupportedGet()                     //supportMode
	cmds << zwave.manufacturerSpecificV1.manufacturerSpecificGet()                  //fingerprint
	cmds << zwave.versionV1.versionGet()
	sendEvent(name: "configuration", value: "sent", displayed: true)
	sendEvent(name: "configure", value: "configure") 
	secureSequence(cmds)
}

def refresh() {
	log.trace "refresh"
	poll()
}

def daysToTime(days) {
	days*24*60*60*1000
}

def updated() {
	sendEvent(name: "checkInterval", value: 2 * 15 * 60 + 2 * 60, displayed: false, data: [protocol: "zwave", hubHardwareId: device.hub.hardwareID])
	if (!state.updatedLastRanAt || new Date().time >= state.updatedLastRanAt + 2000) {
		state.updatedLastRanAt = new Date().time
		unschedule(refresh)
		unschedule(poll)
		log.trace "Configuring settings"
		runIn (05, configure)
		switch(refreshRate) {
			case "1":
			runEvery1Minute(poll)
			log.info "Refresh Scheduled for every minute"
			break
		
        	case "15":
			runEvery15Minutes(poll)
			log.info "Refresh Scheduled for every 15 minutes"
			break
		
        	case "10":
			runEvery10Minutes(poll)
			log.info "Refresh Scheduled for every 10 minutes"
			break
		
        	case "5":
			runEvery5Minutes(poll)
			log.info "Refresh Scheduled for every 5 minutes"
			break
		
            case "0":
			log.info "Refresh off"
        }
	} else {
	    log.warn "update ran within the last 2 seconds"
	}
}

def ping() {
	refresh()
}

def poll() { // If you add the Polling capability to your device type, this command will be called approximately every 5 minutes to check the device's state
	def cmds = []
	if (!state.lastBatteryReportReceivedAt || (new Date().time) - state.lastBatteryReportReceivedAt > daysToTime(1)) {
		log.trace "POLL - Asking for battery report as over 1 days since"
		cmds << zwave.batteryV1.batteryGet()
	}
	if (!state.extra || (new Date().time) - state.extra > (60*60000)) {
	    cmds <<	zwave.thermostatModeV2.thermostatModeGet()	// get mode
		cmds <<	zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 11) 	// get eco/cool setpoint
		cmds <<	zwave.basicV1.basicGet()											// get mode (basic)	
		cmds <<	zwave.thermostatSetpointV2.thermostatSetpointGet(setpointType: 1)	// get heating setpoint
		state.extra = new Date().time
	}
	cmds <<	zwave.sensorMultilevelV1.sensorMultilevelGet()	// get temp
	cmds << zwave.switchMultilevelV3.switchMultilevelGet()	// valve position
	cmds <<	zwave.thermostatModeV1.thermostatModeGet()		// get mode
	log.trace "POLL $cmds"
	secureSequence (cmds)
}

def zwaveEvent(hubitat.zwave.commands.crc16encapv1.Crc16Encap cmd) { //dont know if this is used
	log.debug "crc16encap- $cmd"
	def versions = [0x31: 5, 0x30: 1, 0x9C: 1, 0x70: 2, 0x85: 2]
	def version = versions[cmd.commandClass as Integer]
	def ccObj = version ? zwave.commandClass(cmd.commandClass, version) : zwave.commandClass(cmd.commandClass)
	def encapsulatedCommand = ccObj?.command(cmd.command)?.parse(cmd.data)
	if (encapsulatedCommand) {
		zwaveEvent(encapsulatedCommand)
	}
}