/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getAutonomousDst <em>Autonomous Dst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getCommunication <em>Communication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getConnectDisconnect <em>Connect Disconnect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getDemandResponse <em>Demand Response</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getElectricMetering <em>Electric Metering</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getGasMetering <em>Gas Metering</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getMetrology <em>Metrology</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOnRequestRead <em>On Request Read</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOutageHistory <em>Outage History</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPressureCompensation <em>Pressure Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPricingInfo <em>Pricing Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPulseOutput <em>Pulse Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getRelaysProgramming <em>Relays Programming</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getReverseFlow <em>Reverse Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getSuperCompressibilityCompensation <em>Super Compressibility Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTemperatureCompensation <em>Temperature Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTextMessage <em>Text Message</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getWaterMetering <em>Water Metering</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability()
 * @model
 * @generated
 */
public interface EndDeviceCapability extends EObject {
    /**
     * Returns the value of the '<em><b>Autonomous Dst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Autonomous Dst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Autonomous Dst</em>' attribute.
     * @see #isSetAutonomousDst()
     * @see #unsetAutonomousDst()
     * @see #setAutonomousDst(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_AutonomousDst()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.autonomousDst' kind='element'"
     * @generated
     */
    Boolean getAutonomousDst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getAutonomousDst <em>Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Autonomous Dst</em>' attribute.
     * @see #isSetAutonomousDst()
     * @see #unsetAutonomousDst()
     * @see #getAutonomousDst()
     * @generated
     */
    void setAutonomousDst( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getAutonomousDst <em>Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAutonomousDst()
     * @see #getAutonomousDst()
     * @see #setAutonomousDst(Boolean)
     * @generated
     */
    void unsetAutonomousDst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getAutonomousDst <em>Autonomous Dst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Autonomous Dst</em>' attribute is set.
     * @see #unsetAutonomousDst()
     * @see #getAutonomousDst()
     * @see #setAutonomousDst(Boolean)
     * @generated
     */
    boolean isSetAutonomousDst();

    /**
     * Returns the value of the '<em><b>Communication</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Communication</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Communication</em>' attribute.
     * @see #isSetCommunication()
     * @see #unsetCommunication()
     * @see #setCommunication(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_Communication()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.communication' kind='element'"
     * @generated
     */
    Boolean getCommunication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getCommunication <em>Communication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Communication</em>' attribute.
     * @see #isSetCommunication()
     * @see #unsetCommunication()
     * @see #getCommunication()
     * @generated
     */
    void setCommunication( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getCommunication <em>Communication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommunication()
     * @see #getCommunication()
     * @see #setCommunication(Boolean)
     * @generated
     */
    void unsetCommunication();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getCommunication <em>Communication</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Communication</em>' attribute is set.
     * @see #unsetCommunication()
     * @see #getCommunication()
     * @see #setCommunication(Boolean)
     * @generated
     */
    boolean isSetCommunication();

    /**
     * Returns the value of the '<em><b>Connect Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connect Disconnect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connect Disconnect</em>' attribute.
     * @see #isSetConnectDisconnect()
     * @see #unsetConnectDisconnect()
     * @see #setConnectDisconnect(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_ConnectDisconnect()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.connectDisconnect' kind='element'"
     * @generated
     */
    Boolean getConnectDisconnect();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getConnectDisconnect <em>Connect Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connect Disconnect</em>' attribute.
     * @see #isSetConnectDisconnect()
     * @see #unsetConnectDisconnect()
     * @see #getConnectDisconnect()
     * @generated
     */
    void setConnectDisconnect( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getConnectDisconnect <em>Connect Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectDisconnect()
     * @see #getConnectDisconnect()
     * @see #setConnectDisconnect(Boolean)
     * @generated
     */
    void unsetConnectDisconnect();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getConnectDisconnect <em>Connect Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connect Disconnect</em>' attribute is set.
     * @see #unsetConnectDisconnect()
     * @see #getConnectDisconnect()
     * @see #setConnectDisconnect(Boolean)
     * @generated
     */
    boolean isSetConnectDisconnect();

    /**
     * Returns the value of the '<em><b>Demand Response</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Demand Response</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Demand Response</em>' attribute.
     * @see #isSetDemandResponse()
     * @see #unsetDemandResponse()
     * @see #setDemandResponse(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_DemandResponse()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.demandResponse' kind='element'"
     * @generated
     */
    Boolean getDemandResponse();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getDemandResponse <em>Demand Response</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Demand Response</em>' attribute.
     * @see #isSetDemandResponse()
     * @see #unsetDemandResponse()
     * @see #getDemandResponse()
     * @generated
     */
    void setDemandResponse( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getDemandResponse <em>Demand Response</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDemandResponse()
     * @see #getDemandResponse()
     * @see #setDemandResponse(Boolean)
     * @generated
     */
    void unsetDemandResponse();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getDemandResponse <em>Demand Response</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Demand Response</em>' attribute is set.
     * @see #unsetDemandResponse()
     * @see #getDemandResponse()
     * @see #setDemandResponse(Boolean)
     * @generated
     */
    boolean isSetDemandResponse();

    /**
     * Returns the value of the '<em><b>Electric Metering</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Electric Metering</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Electric Metering</em>' attribute.
     * @see #isSetElectricMetering()
     * @see #unsetElectricMetering()
     * @see #setElectricMetering(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_ElectricMetering()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.electricMetering' kind='element'"
     * @generated
     */
    Boolean getElectricMetering();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getElectricMetering <em>Electric Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Electric Metering</em>' attribute.
     * @see #isSetElectricMetering()
     * @see #unsetElectricMetering()
     * @see #getElectricMetering()
     * @generated
     */
    void setElectricMetering( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getElectricMetering <em>Electric Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetElectricMetering()
     * @see #getElectricMetering()
     * @see #setElectricMetering(Boolean)
     * @generated
     */
    void unsetElectricMetering();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getElectricMetering <em>Electric Metering</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Electric Metering</em>' attribute is set.
     * @see #unsetElectricMetering()
     * @see #getElectricMetering()
     * @see #setElectricMetering(Boolean)
     * @generated
     */
    boolean isSetElectricMetering();

    /**
     * Returns the value of the '<em><b>Gas Metering</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gas Metering</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gas Metering</em>' attribute.
     * @see #isSetGasMetering()
     * @see #unsetGasMetering()
     * @see #setGasMetering(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_GasMetering()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.gasMetering' kind='element'"
     * @generated
     */
    Boolean getGasMetering();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getGasMetering <em>Gas Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gas Metering</em>' attribute.
     * @see #isSetGasMetering()
     * @see #unsetGasMetering()
     * @see #getGasMetering()
     * @generated
     */
    void setGasMetering( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getGasMetering <em>Gas Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGasMetering()
     * @see #getGasMetering()
     * @see #setGasMetering(Boolean)
     * @generated
     */
    void unsetGasMetering();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getGasMetering <em>Gas Metering</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gas Metering</em>' attribute is set.
     * @see #unsetGasMetering()
     * @see #getGasMetering()
     * @see #setGasMetering(Boolean)
     * @generated
     */
    boolean isSetGasMetering();

    /**
     * Returns the value of the '<em><b>Metrology</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metrology</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metrology</em>' attribute.
     * @see #isSetMetrology()
     * @see #unsetMetrology()
     * @see #setMetrology(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_Metrology()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.metrology' kind='element'"
     * @generated
     */
    Boolean getMetrology();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getMetrology <em>Metrology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Metrology</em>' attribute.
     * @see #isSetMetrology()
     * @see #unsetMetrology()
     * @see #getMetrology()
     * @generated
     */
    void setMetrology( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getMetrology <em>Metrology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMetrology()
     * @see #getMetrology()
     * @see #setMetrology(Boolean)
     * @generated
     */
    void unsetMetrology();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getMetrology <em>Metrology</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Metrology</em>' attribute is set.
     * @see #unsetMetrology()
     * @see #getMetrology()
     * @see #setMetrology(Boolean)
     * @generated
     */
    boolean isSetMetrology();

    /**
     * Returns the value of the '<em><b>On Request Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>On Request Read</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>On Request Read</em>' attribute.
     * @see #isSetOnRequestRead()
     * @see #unsetOnRequestRead()
     * @see #setOnRequestRead(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_OnRequestRead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.onRequestRead' kind='element'"
     * @generated
     */
    Boolean getOnRequestRead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOnRequestRead <em>On Request Read</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Request Read</em>' attribute.
     * @see #isSetOnRequestRead()
     * @see #unsetOnRequestRead()
     * @see #getOnRequestRead()
     * @generated
     */
    void setOnRequestRead( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOnRequestRead <em>On Request Read</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOnRequestRead()
     * @see #getOnRequestRead()
     * @see #setOnRequestRead(Boolean)
     * @generated
     */
    void unsetOnRequestRead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOnRequestRead <em>On Request Read</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>On Request Read</em>' attribute is set.
     * @see #unsetOnRequestRead()
     * @see #getOnRequestRead()
     * @see #setOnRequestRead(Boolean)
     * @generated
     */
    boolean isSetOnRequestRead();

    /**
     * Returns the value of the '<em><b>Outage History</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage History</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage History</em>' attribute.
     * @see #isSetOutageHistory()
     * @see #unsetOutageHistory()
     * @see #setOutageHistory(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_OutageHistory()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.outageHistory' kind='element'"
     * @generated
     */
    Boolean getOutageHistory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOutageHistory <em>Outage History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outage History</em>' attribute.
     * @see #isSetOutageHistory()
     * @see #unsetOutageHistory()
     * @see #getOutageHistory()
     * @generated
     */
    void setOutageHistory( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOutageHistory <em>Outage History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutageHistory()
     * @see #getOutageHistory()
     * @see #setOutageHistory(Boolean)
     * @generated
     */
    void unsetOutageHistory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getOutageHistory <em>Outage History</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage History</em>' attribute is set.
     * @see #unsetOutageHistory()
     * @see #getOutageHistory()
     * @see #setOutageHistory(Boolean)
     * @generated
     */
    boolean isSetOutageHistory();

    /**
     * Returns the value of the '<em><b>Pressure Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pressure Compensation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pressure Compensation</em>' attribute.
     * @see #isSetPressureCompensation()
     * @see #unsetPressureCompensation()
     * @see #setPressureCompensation(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_PressureCompensation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.pressureCompensation' kind='element'"
     * @generated
     */
    Boolean getPressureCompensation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPressureCompensation <em>Pressure Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pressure Compensation</em>' attribute.
     * @see #isSetPressureCompensation()
     * @see #unsetPressureCompensation()
     * @see #getPressureCompensation()
     * @generated
     */
    void setPressureCompensation( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPressureCompensation <em>Pressure Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPressureCompensation()
     * @see #getPressureCompensation()
     * @see #setPressureCompensation(Boolean)
     * @generated
     */
    void unsetPressureCompensation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPressureCompensation <em>Pressure Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pressure Compensation</em>' attribute is set.
     * @see #unsetPressureCompensation()
     * @see #getPressureCompensation()
     * @see #setPressureCompensation(Boolean)
     * @generated
     */
    boolean isSetPressureCompensation();

    /**
     * Returns the value of the '<em><b>Pricing Info</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pricing Info</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pricing Info</em>' attribute.
     * @see #isSetPricingInfo()
     * @see #unsetPricingInfo()
     * @see #setPricingInfo(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_PricingInfo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.pricingInfo' kind='element'"
     * @generated
     */
    Boolean getPricingInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPricingInfo <em>Pricing Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pricing Info</em>' attribute.
     * @see #isSetPricingInfo()
     * @see #unsetPricingInfo()
     * @see #getPricingInfo()
     * @generated
     */
    void setPricingInfo( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPricingInfo <em>Pricing Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPricingInfo()
     * @see #getPricingInfo()
     * @see #setPricingInfo(Boolean)
     * @generated
     */
    void unsetPricingInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPricingInfo <em>Pricing Info</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pricing Info</em>' attribute is set.
     * @see #unsetPricingInfo()
     * @see #getPricingInfo()
     * @see #setPricingInfo(Boolean)
     * @generated
     */
    boolean isSetPricingInfo();

    /**
     * Returns the value of the '<em><b>Pulse Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pulse Output</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pulse Output</em>' attribute.
     * @see #isSetPulseOutput()
     * @see #unsetPulseOutput()
     * @see #setPulseOutput(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_PulseOutput()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.pulseOutput' kind='element'"
     * @generated
     */
    Boolean getPulseOutput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPulseOutput <em>Pulse Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pulse Output</em>' attribute.
     * @see #isSetPulseOutput()
     * @see #unsetPulseOutput()
     * @see #getPulseOutput()
     * @generated
     */
    void setPulseOutput( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPulseOutput <em>Pulse Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPulseOutput()
     * @see #getPulseOutput()
     * @see #setPulseOutput(Boolean)
     * @generated
     */
    void unsetPulseOutput();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getPulseOutput <em>Pulse Output</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pulse Output</em>' attribute is set.
     * @see #unsetPulseOutput()
     * @see #getPulseOutput()
     * @see #setPulseOutput(Boolean)
     * @generated
     */
    boolean isSetPulseOutput();

    /**
     * Returns the value of the '<em><b>Relays Programming</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relays Programming</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relays Programming</em>' attribute.
     * @see #isSetRelaysProgramming()
     * @see #unsetRelaysProgramming()
     * @see #setRelaysProgramming(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_RelaysProgramming()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.relaysProgramming' kind='element'"
     * @generated
     */
    Boolean getRelaysProgramming();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getRelaysProgramming <em>Relays Programming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relays Programming</em>' attribute.
     * @see #isSetRelaysProgramming()
     * @see #unsetRelaysProgramming()
     * @see #getRelaysProgramming()
     * @generated
     */
    void setRelaysProgramming( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getRelaysProgramming <em>Relays Programming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelaysProgramming()
     * @see #getRelaysProgramming()
     * @see #setRelaysProgramming(Boolean)
     * @generated
     */
    void unsetRelaysProgramming();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getRelaysProgramming <em>Relays Programming</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Relays Programming</em>' attribute is set.
     * @see #unsetRelaysProgramming()
     * @see #getRelaysProgramming()
     * @see #setRelaysProgramming(Boolean)
     * @generated
     */
    boolean isSetRelaysProgramming();

    /**
     * Returns the value of the '<em><b>Reverse Flow</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reverse Flow</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reverse Flow</em>' attribute.
     * @see #isSetReverseFlow()
     * @see #unsetReverseFlow()
     * @see #setReverseFlow(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_ReverseFlow()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.reverseFlow' kind='element'"
     * @generated
     */
    Boolean getReverseFlow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getReverseFlow <em>Reverse Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reverse Flow</em>' attribute.
     * @see #isSetReverseFlow()
     * @see #unsetReverseFlow()
     * @see #getReverseFlow()
     * @generated
     */
    void setReverseFlow( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getReverseFlow <em>Reverse Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReverseFlow()
     * @see #getReverseFlow()
     * @see #setReverseFlow(Boolean)
     * @generated
     */
    void unsetReverseFlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getReverseFlow <em>Reverse Flow</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reverse Flow</em>' attribute is set.
     * @see #unsetReverseFlow()
     * @see #getReverseFlow()
     * @see #setReverseFlow(Boolean)
     * @generated
     */
    boolean isSetReverseFlow();

    /**
     * Returns the value of the '<em><b>Super Compressibility Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Compressibility Compensation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Compressibility Compensation</em>' attribute.
     * @see #isSetSuperCompressibilityCompensation()
     * @see #unsetSuperCompressibilityCompensation()
     * @see #setSuperCompressibilityCompensation(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_SuperCompressibilityCompensation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.superCompressibilityCompensation' kind='element'"
     * @generated
     */
    Boolean getSuperCompressibilityCompensation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getSuperCompressibilityCompensation <em>Super Compressibility Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Compressibility Compensation</em>' attribute.
     * @see #isSetSuperCompressibilityCompensation()
     * @see #unsetSuperCompressibilityCompensation()
     * @see #getSuperCompressibilityCompensation()
     * @generated
     */
    void setSuperCompressibilityCompensation( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getSuperCompressibilityCompensation <em>Super Compressibility Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSuperCompressibilityCompensation()
     * @see #getSuperCompressibilityCompensation()
     * @see #setSuperCompressibilityCompensation(Boolean)
     * @generated
     */
    void unsetSuperCompressibilityCompensation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getSuperCompressibilityCompensation <em>Super Compressibility Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Super Compressibility Compensation</em>' attribute is set.
     * @see #unsetSuperCompressibilityCompensation()
     * @see #getSuperCompressibilityCompensation()
     * @see #setSuperCompressibilityCompensation(Boolean)
     * @generated
     */
    boolean isSetSuperCompressibilityCompensation();

    /**
     * Returns the value of the '<em><b>Temperature Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Temperature Compensation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Temperature Compensation</em>' attribute.
     * @see #isSetTemperatureCompensation()
     * @see #unsetTemperatureCompensation()
     * @see #setTemperatureCompensation(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_TemperatureCompensation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.temperatureCompensation' kind='element'"
     * @generated
     */
    Boolean getTemperatureCompensation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTemperatureCompensation <em>Temperature Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Temperature Compensation</em>' attribute.
     * @see #isSetTemperatureCompensation()
     * @see #unsetTemperatureCompensation()
     * @see #getTemperatureCompensation()
     * @generated
     */
    void setTemperatureCompensation( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTemperatureCompensation <em>Temperature Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTemperatureCompensation()
     * @see #getTemperatureCompensation()
     * @see #setTemperatureCompensation(Boolean)
     * @generated
     */
    void unsetTemperatureCompensation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTemperatureCompensation <em>Temperature Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Temperature Compensation</em>' attribute is set.
     * @see #unsetTemperatureCompensation()
     * @see #getTemperatureCompensation()
     * @see #setTemperatureCompensation(Boolean)
     * @generated
     */
    boolean isSetTemperatureCompensation();

    /**
     * Returns the value of the '<em><b>Text Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text Message</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text Message</em>' attribute.
     * @see #isSetTextMessage()
     * @see #unsetTextMessage()
     * @see #setTextMessage(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_TextMessage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.textMessage' kind='element'"
     * @generated
     */
    Boolean getTextMessage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTextMessage <em>Text Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Message</em>' attribute.
     * @see #isSetTextMessage()
     * @see #unsetTextMessage()
     * @see #getTextMessage()
     * @generated
     */
    void setTextMessage( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTextMessage <em>Text Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTextMessage()
     * @see #getTextMessage()
     * @see #setTextMessage(Boolean)
     * @generated
     */
    void unsetTextMessage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getTextMessage <em>Text Message</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Text Message</em>' attribute is set.
     * @see #unsetTextMessage()
     * @see #getTextMessage()
     * @see #setTextMessage(Boolean)
     * @generated
     */
    boolean isSetTextMessage();

    /**
     * Returns the value of the '<em><b>Water Metering</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Water Metering</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Water Metering</em>' attribute.
     * @see #isSetWaterMetering()
     * @see #unsetWaterMetering()
     * @see #setWaterMetering(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceCapability_WaterMetering()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceCapability.waterMetering' kind='element'"
     * @generated
     */
    Boolean getWaterMetering();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getWaterMetering <em>Water Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Water Metering</em>' attribute.
     * @see #isSetWaterMetering()
     * @see #unsetWaterMetering()
     * @see #getWaterMetering()
     * @generated
     */
    void setWaterMetering( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getWaterMetering <em>Water Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWaterMetering()
     * @see #getWaterMetering()
     * @see #setWaterMetering(Boolean)
     * @generated
     */
    void unsetWaterMetering();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability#getWaterMetering <em>Water Metering</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Water Metering</em>' attribute is set.
     * @see #unsetWaterMetering()
     * @see #getWaterMetering()
     * @see #setWaterMetering(Boolean)
     * @generated
     */
    boolean isSetWaterMetering();

} // EndDeviceCapability
