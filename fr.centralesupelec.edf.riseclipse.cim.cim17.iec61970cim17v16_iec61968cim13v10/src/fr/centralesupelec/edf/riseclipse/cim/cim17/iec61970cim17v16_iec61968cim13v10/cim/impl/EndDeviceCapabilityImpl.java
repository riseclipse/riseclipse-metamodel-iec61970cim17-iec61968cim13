/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceCapability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getAutonomousDst <em>Autonomous Dst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getConnectDisconnect <em>Connect Disconnect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getDemandResponse <em>Demand Response</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getElectricMetering <em>Electric Metering</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getGasMetering <em>Gas Metering</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getMetrology <em>Metrology</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getOnRequestRead <em>On Request Read</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getOutageHistory <em>Outage History</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getPressureCompensation <em>Pressure Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getPricingInfo <em>Pricing Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getPulseOutput <em>Pulse Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getRelaysProgramming <em>Relays Programming</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getReverseFlow <em>Reverse Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getSuperCompressibilityCompensation <em>Super Compressibility Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getTemperatureCompensation <em>Temperature Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getTextMessage <em>Text Message</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceCapabilityImpl#getWaterMetering <em>Water Metering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceCapabilityImpl extends MinimalEObjectImpl.Container implements EndDeviceCapability {
    /**
     * The default value of the '{@link #getAutonomousDst() <em>Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutonomousDst()
     * @generated
     * @ordered
     */
    protected static final Boolean AUTONOMOUS_DST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAutonomousDst() <em>Autonomous Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutonomousDst()
     * @generated
     * @ordered
     */
    protected Boolean autonomousDst = AUTONOMOUS_DST_EDEFAULT;

    /**
     * This is true if the Autonomous Dst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean autonomousDstESet;

    /**
     * The default value of the '{@link #getCommunication() <em>Communication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunication()
     * @generated
     * @ordered
     */
    protected static final Boolean COMMUNICATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCommunication() <em>Communication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunication()
     * @generated
     * @ordered
     */
    protected Boolean communication = COMMUNICATION_EDEFAULT;

    /**
     * This is true if the Communication attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean communicationESet;

    /**
     * The default value of the '{@link #getConnectDisconnect() <em>Connect Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectDisconnect()
     * @generated
     * @ordered
     */
    protected static final Boolean CONNECT_DISCONNECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectDisconnect() <em>Connect Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectDisconnect()
     * @generated
     * @ordered
     */
    protected Boolean connectDisconnect = CONNECT_DISCONNECT_EDEFAULT;

    /**
     * This is true if the Connect Disconnect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectDisconnectESet;

    /**
     * The default value of the '{@link #getDemandResponse() <em>Demand Response</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDemandResponse()
     * @generated
     * @ordered
     */
    protected static final Boolean DEMAND_RESPONSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDemandResponse() <em>Demand Response</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDemandResponse()
     * @generated
     * @ordered
     */
    protected Boolean demandResponse = DEMAND_RESPONSE_EDEFAULT;

    /**
     * This is true if the Demand Response attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean demandResponseESet;

    /**
     * The default value of the '{@link #getElectricMetering() <em>Electric Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectricMetering()
     * @generated
     * @ordered
     */
    protected static final Boolean ELECTRIC_METERING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElectricMetering() <em>Electric Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectricMetering()
     * @generated
     * @ordered
     */
    protected Boolean electricMetering = ELECTRIC_METERING_EDEFAULT;

    /**
     * This is true if the Electric Metering attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean electricMeteringESet;

    /**
     * The default value of the '{@link #getGasMetering() <em>Gas Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGasMetering()
     * @generated
     * @ordered
     */
    protected static final Boolean GAS_METERING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGasMetering() <em>Gas Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGasMetering()
     * @generated
     * @ordered
     */
    protected Boolean gasMetering = GAS_METERING_EDEFAULT;

    /**
     * This is true if the Gas Metering attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gasMeteringESet;

    /**
     * The default value of the '{@link #getMetrology() <em>Metrology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetrology()
     * @generated
     * @ordered
     */
    protected static final Boolean METROLOGY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMetrology() <em>Metrology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetrology()
     * @generated
     * @ordered
     */
    protected Boolean metrology = METROLOGY_EDEFAULT;

    /**
     * This is true if the Metrology attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean metrologyESet;

    /**
     * The default value of the '{@link #getOnRequestRead() <em>On Request Read</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnRequestRead()
     * @generated
     * @ordered
     */
    protected static final Boolean ON_REQUEST_READ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnRequestRead() <em>On Request Read</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnRequestRead()
     * @generated
     * @ordered
     */
    protected Boolean onRequestRead = ON_REQUEST_READ_EDEFAULT;

    /**
     * This is true if the On Request Read attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean onRequestReadESet;

    /**
     * The default value of the '{@link #getOutageHistory() <em>Outage History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageHistory()
     * @generated
     * @ordered
     */
    protected static final Boolean OUTAGE_HISTORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutageHistory() <em>Outage History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageHistory()
     * @generated
     * @ordered
     */
    protected Boolean outageHistory = OUTAGE_HISTORY_EDEFAULT;

    /**
     * This is true if the Outage History attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageHistoryESet;

    /**
     * The default value of the '{@link #getPressureCompensation() <em>Pressure Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCompensation()
     * @generated
     * @ordered
     */
    protected static final Boolean PRESSURE_COMPENSATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureCompensation() <em>Pressure Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCompensation()
     * @generated
     * @ordered
     */
    protected Boolean pressureCompensation = PRESSURE_COMPENSATION_EDEFAULT;

    /**
     * This is true if the Pressure Compensation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureCompensationESet;

    /**
     * The default value of the '{@link #getPricingInfo() <em>Pricing Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPricingInfo()
     * @generated
     * @ordered
     */
    protected static final Boolean PRICING_INFO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPricingInfo() <em>Pricing Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPricingInfo()
     * @generated
     * @ordered
     */
    protected Boolean pricingInfo = PRICING_INFO_EDEFAULT;

    /**
     * This is true if the Pricing Info attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pricingInfoESet;

    /**
     * The default value of the '{@link #getPulseOutput() <em>Pulse Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPulseOutput()
     * @generated
     * @ordered
     */
    protected static final Boolean PULSE_OUTPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPulseOutput() <em>Pulse Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPulseOutput()
     * @generated
     * @ordered
     */
    protected Boolean pulseOutput = PULSE_OUTPUT_EDEFAULT;

    /**
     * This is true if the Pulse Output attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pulseOutputESet;

    /**
     * The default value of the '{@link #getRelaysProgramming() <em>Relays Programming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelaysProgramming()
     * @generated
     * @ordered
     */
    protected static final Boolean RELAYS_PROGRAMMING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelaysProgramming() <em>Relays Programming</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelaysProgramming()
     * @generated
     * @ordered
     */
    protected Boolean relaysProgramming = RELAYS_PROGRAMMING_EDEFAULT;

    /**
     * This is true if the Relays Programming attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean relaysProgrammingESet;

    /**
     * The default value of the '{@link #getReverseFlow() <em>Reverse Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReverseFlow()
     * @generated
     * @ordered
     */
    protected static final Boolean REVERSE_FLOW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReverseFlow() <em>Reverse Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReverseFlow()
     * @generated
     * @ordered
     */
    protected Boolean reverseFlow = REVERSE_FLOW_EDEFAULT;

    /**
     * This is true if the Reverse Flow attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reverseFlowESet;

    /**
     * The default value of the '{@link #getSuperCompressibilityCompensation() <em>Super Compressibility Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperCompressibilityCompensation()
     * @generated
     * @ordered
     */
    protected static final Boolean SUPER_COMPRESSIBILITY_COMPENSATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuperCompressibilityCompensation() <em>Super Compressibility Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperCompressibilityCompensation()
     * @generated
     * @ordered
     */
    protected Boolean superCompressibilityCompensation = SUPER_COMPRESSIBILITY_COMPENSATION_EDEFAULT;

    /**
     * This is true if the Super Compressibility Compensation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean superCompressibilityCompensationESet;

    /**
     * The default value of the '{@link #getTemperatureCompensation() <em>Temperature Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemperatureCompensation()
     * @generated
     * @ordered
     */
    protected static final Boolean TEMPERATURE_COMPENSATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemperatureCompensation() <em>Temperature Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemperatureCompensation()
     * @generated
     * @ordered
     */
    protected Boolean temperatureCompensation = TEMPERATURE_COMPENSATION_EDEFAULT;

    /**
     * This is true if the Temperature Compensation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean temperatureCompensationESet;

    /**
     * The default value of the '{@link #getTextMessage() <em>Text Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextMessage()
     * @generated
     * @ordered
     */
    protected static final Boolean TEXT_MESSAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTextMessage() <em>Text Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextMessage()
     * @generated
     * @ordered
     */
    protected Boolean textMessage = TEXT_MESSAGE_EDEFAULT;

    /**
     * This is true if the Text Message attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean textMessageESet;

    /**
     * The default value of the '{@link #getWaterMetering() <em>Water Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaterMetering()
     * @generated
     * @ordered
     */
    protected static final Boolean WATER_METERING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWaterMetering() <em>Water Metering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaterMetering()
     * @generated
     * @ordered
     */
    protected Boolean waterMetering = WATER_METERING_EDEFAULT;

    /**
     * This is true if the Water Metering attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean waterMeteringESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceCapabilityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceCapability();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getAutonomousDst() {
        return autonomousDst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAutonomousDst( Boolean newAutonomousDst ) {
        Boolean oldAutonomousDst = autonomousDst;
        autonomousDst = newAutonomousDst;
        boolean oldAutonomousDstESet = autonomousDstESet;
        autonomousDstESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__AUTONOMOUS_DST,
                    oldAutonomousDst, autonomousDst, !oldAutonomousDstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAutonomousDst() {
        Boolean oldAutonomousDst = autonomousDst;
        boolean oldAutonomousDstESet = autonomousDstESet;
        autonomousDst = AUTONOMOUS_DST_EDEFAULT;
        autonomousDstESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__AUTONOMOUS_DST,
                    oldAutonomousDst, AUTONOMOUS_DST_EDEFAULT, oldAutonomousDstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAutonomousDst() {
        return autonomousDstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCommunication() {
        return communication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCommunication( Boolean newCommunication ) {
        Boolean oldCommunication = communication;
        communication = newCommunication;
        boolean oldCommunicationESet = communicationESet;
        communicationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__COMMUNICATION,
                    oldCommunication, communication, !oldCommunicationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommunication() {
        Boolean oldCommunication = communication;
        boolean oldCommunicationESet = communicationESet;
        communication = COMMUNICATION_EDEFAULT;
        communicationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__COMMUNICATION,
                    oldCommunication, COMMUNICATION_EDEFAULT, oldCommunicationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommunication() {
        return communicationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getConnectDisconnect() {
        return connectDisconnect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectDisconnect( Boolean newConnectDisconnect ) {
        Boolean oldConnectDisconnect = connectDisconnect;
        connectDisconnect = newConnectDisconnect;
        boolean oldConnectDisconnectESet = connectDisconnectESet;
        connectDisconnectESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__CONNECT_DISCONNECT,
                        oldConnectDisconnect, connectDisconnect, !oldConnectDisconnectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectDisconnect() {
        Boolean oldConnectDisconnect = connectDisconnect;
        boolean oldConnectDisconnectESet = connectDisconnectESet;
        connectDisconnect = CONNECT_DISCONNECT_EDEFAULT;
        connectDisconnectESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__CONNECT_DISCONNECT,
                        oldConnectDisconnect, CONNECT_DISCONNECT_EDEFAULT, oldConnectDisconnectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectDisconnect() {
        return connectDisconnectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDemandResponse() {
        return demandResponse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDemandResponse( Boolean newDemandResponse ) {
        Boolean oldDemandResponse = demandResponse;
        demandResponse = newDemandResponse;
        boolean oldDemandResponseESet = demandResponseESet;
        demandResponseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__DEMAND_RESPONSE,
                    oldDemandResponse, demandResponse, !oldDemandResponseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDemandResponse() {
        Boolean oldDemandResponse = demandResponse;
        boolean oldDemandResponseESet = demandResponseESet;
        demandResponse = DEMAND_RESPONSE_EDEFAULT;
        demandResponseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__DEMAND_RESPONSE,
                    oldDemandResponse, DEMAND_RESPONSE_EDEFAULT, oldDemandResponseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDemandResponse() {
        return demandResponseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getElectricMetering() {
        return electricMetering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElectricMetering( Boolean newElectricMetering ) {
        Boolean oldElectricMetering = electricMetering;
        electricMetering = newElectricMetering;
        boolean oldElectricMeteringESet = electricMeteringESet;
        electricMeteringESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__ELECTRIC_METERING,
                    oldElectricMetering, electricMetering, !oldElectricMeteringESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetElectricMetering() {
        Boolean oldElectricMetering = electricMetering;
        boolean oldElectricMeteringESet = electricMeteringESet;
        electricMetering = ELECTRIC_METERING_EDEFAULT;
        electricMeteringESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__ELECTRIC_METERING,
                        oldElectricMetering, ELECTRIC_METERING_EDEFAULT, oldElectricMeteringESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectricMetering() {
        return electricMeteringESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGasMetering() {
        return gasMetering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGasMetering( Boolean newGasMetering ) {
        Boolean oldGasMetering = gasMetering;
        gasMetering = newGasMetering;
        boolean oldGasMeteringESet = gasMeteringESet;
        gasMeteringESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__GAS_METERING, oldGasMetering, gasMetering, !oldGasMeteringESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGasMetering() {
        Boolean oldGasMetering = gasMetering;
        boolean oldGasMeteringESet = gasMeteringESet;
        gasMetering = GAS_METERING_EDEFAULT;
        gasMeteringESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__GAS_METERING,
                    oldGasMetering, GAS_METERING_EDEFAULT, oldGasMeteringESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGasMetering() {
        return gasMeteringESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMetrology() {
        return metrology;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMetrology( Boolean newMetrology ) {
        Boolean oldMetrology = metrology;
        metrology = newMetrology;
        boolean oldMetrologyESet = metrologyESet;
        metrologyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__METROLOGY, oldMetrology, metrology, !oldMetrologyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMetrology() {
        Boolean oldMetrology = metrology;
        boolean oldMetrologyESet = metrologyESet;
        metrology = METROLOGY_EDEFAULT;
        metrologyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_CAPABILITY__METROLOGY, oldMetrology, METROLOGY_EDEFAULT, oldMetrologyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMetrology() {
        return metrologyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOnRequestRead() {
        return onRequestRead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOnRequestRead( Boolean newOnRequestRead ) {
        Boolean oldOnRequestRead = onRequestRead;
        onRequestRead = newOnRequestRead;
        boolean oldOnRequestReadESet = onRequestReadESet;
        onRequestReadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__ON_REQUEST_READ,
                    oldOnRequestRead, onRequestRead, !oldOnRequestReadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOnRequestRead() {
        Boolean oldOnRequestRead = onRequestRead;
        boolean oldOnRequestReadESet = onRequestReadESet;
        onRequestRead = ON_REQUEST_READ_EDEFAULT;
        onRequestReadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__ON_REQUEST_READ,
                    oldOnRequestRead, ON_REQUEST_READ_EDEFAULT, oldOnRequestReadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOnRequestRead() {
        return onRequestReadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOutageHistory() {
        return outageHistory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutageHistory( Boolean newOutageHistory ) {
        Boolean oldOutageHistory = outageHistory;
        outageHistory = newOutageHistory;
        boolean oldOutageHistoryESet = outageHistoryESet;
        outageHistoryESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__OUTAGE_HISTORY,
                    oldOutageHistory, outageHistory, !oldOutageHistoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutageHistory() {
        Boolean oldOutageHistory = outageHistory;
        boolean oldOutageHistoryESet = outageHistoryESet;
        outageHistory = OUTAGE_HISTORY_EDEFAULT;
        outageHistoryESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__OUTAGE_HISTORY,
                    oldOutageHistory, OUTAGE_HISTORY_EDEFAULT, oldOutageHistoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutageHistory() {
        return outageHistoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPressureCompensation() {
        return pressureCompensation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureCompensation( Boolean newPressureCompensation ) {
        Boolean oldPressureCompensation = pressureCompensation;
        pressureCompensation = newPressureCompensation;
        boolean oldPressureCompensationESet = pressureCompensationESet;
        pressureCompensationESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__PRESSURE_COMPENSATION,
                        oldPressureCompensation, pressureCompensation, !oldPressureCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureCompensation() {
        Boolean oldPressureCompensation = pressureCompensation;
        boolean oldPressureCompensationESet = pressureCompensationESet;
        pressureCompensation = PRESSURE_COMPENSATION_EDEFAULT;
        pressureCompensationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_CAPABILITY__PRESSURE_COMPENSATION, oldPressureCompensation,
                PRESSURE_COMPENSATION_EDEFAULT, oldPressureCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureCompensation() {
        return pressureCompensationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPricingInfo() {
        return pricingInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPricingInfo( Boolean newPricingInfo ) {
        Boolean oldPricingInfo = pricingInfo;
        pricingInfo = newPricingInfo;
        boolean oldPricingInfoESet = pricingInfoESet;
        pricingInfoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__PRICING_INFO, oldPricingInfo, pricingInfo, !oldPricingInfoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPricingInfo() {
        Boolean oldPricingInfo = pricingInfo;
        boolean oldPricingInfoESet = pricingInfoESet;
        pricingInfo = PRICING_INFO_EDEFAULT;
        pricingInfoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__PRICING_INFO,
                    oldPricingInfo, PRICING_INFO_EDEFAULT, oldPricingInfoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPricingInfo() {
        return pricingInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPulseOutput() {
        return pulseOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPulseOutput( Boolean newPulseOutput ) {
        Boolean oldPulseOutput = pulseOutput;
        pulseOutput = newPulseOutput;
        boolean oldPulseOutputESet = pulseOutputESet;
        pulseOutputESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__PULSE_OUTPUT, oldPulseOutput, pulseOutput, !oldPulseOutputESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPulseOutput() {
        Boolean oldPulseOutput = pulseOutput;
        boolean oldPulseOutputESet = pulseOutputESet;
        pulseOutput = PULSE_OUTPUT_EDEFAULT;
        pulseOutputESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__PULSE_OUTPUT,
                    oldPulseOutput, PULSE_OUTPUT_EDEFAULT, oldPulseOutputESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPulseOutput() {
        return pulseOutputESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRelaysProgramming() {
        return relaysProgramming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelaysProgramming( Boolean newRelaysProgramming ) {
        Boolean oldRelaysProgramming = relaysProgramming;
        relaysProgramming = newRelaysProgramming;
        boolean oldRelaysProgrammingESet = relaysProgrammingESet;
        relaysProgrammingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__RELAYS_PROGRAMMING,
                        oldRelaysProgramming, relaysProgramming, !oldRelaysProgrammingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelaysProgramming() {
        Boolean oldRelaysProgramming = relaysProgramming;
        boolean oldRelaysProgrammingESet = relaysProgrammingESet;
        relaysProgramming = RELAYS_PROGRAMMING_EDEFAULT;
        relaysProgrammingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__RELAYS_PROGRAMMING,
                        oldRelaysProgramming, RELAYS_PROGRAMMING_EDEFAULT, oldRelaysProgrammingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelaysProgramming() {
        return relaysProgrammingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getReverseFlow() {
        return reverseFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReverseFlow( Boolean newReverseFlow ) {
        Boolean oldReverseFlow = reverseFlow;
        reverseFlow = newReverseFlow;
        boolean oldReverseFlowESet = reverseFlowESet;
        reverseFlowESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__REVERSE_FLOW, oldReverseFlow, reverseFlow, !oldReverseFlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReverseFlow() {
        Boolean oldReverseFlow = reverseFlow;
        boolean oldReverseFlowESet = reverseFlowESet;
        reverseFlow = REVERSE_FLOW_EDEFAULT;
        reverseFlowESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__REVERSE_FLOW,
                    oldReverseFlow, REVERSE_FLOW_EDEFAULT, oldReverseFlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReverseFlow() {
        return reverseFlowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSuperCompressibilityCompensation() {
        return superCompressibilityCompensation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuperCompressibilityCompensation( Boolean newSuperCompressibilityCompensation ) {
        Boolean oldSuperCompressibilityCompensation = superCompressibilityCompensation;
        superCompressibilityCompensation = newSuperCompressibilityCompensation;
        boolean oldSuperCompressibilityCompensationESet = superCompressibilityCompensationESet;
        superCompressibilityCompensationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__SUPER_COMPRESSIBILITY_COMPENSATION,
                oldSuperCompressibilityCompensation, superCompressibilityCompensation,
                !oldSuperCompressibilityCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuperCompressibilityCompensation() {
        Boolean oldSuperCompressibilityCompensation = superCompressibilityCompensation;
        boolean oldSuperCompressibilityCompensationESet = superCompressibilityCompensationESet;
        superCompressibilityCompensation = SUPER_COMPRESSIBILITY_COMPENSATION_EDEFAULT;
        superCompressibilityCompensationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_CAPABILITY__SUPER_COMPRESSIBILITY_COMPENSATION,
                oldSuperCompressibilityCompensation, SUPER_COMPRESSIBILITY_COMPENSATION_EDEFAULT,
                oldSuperCompressibilityCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuperCompressibilityCompensation() {
        return superCompressibilityCompensationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTemperatureCompensation() {
        return temperatureCompensation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTemperatureCompensation( Boolean newTemperatureCompensation ) {
        Boolean oldTemperatureCompensation = temperatureCompensation;
        temperatureCompensation = newTemperatureCompensation;
        boolean oldTemperatureCompensationESet = temperatureCompensationESet;
        temperatureCompensationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__TEMPERATURE_COMPENSATION, oldTemperatureCompensation,
                temperatureCompensation, !oldTemperatureCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTemperatureCompensation() {
        Boolean oldTemperatureCompensation = temperatureCompensation;
        boolean oldTemperatureCompensationESet = temperatureCompensationESet;
        temperatureCompensation = TEMPERATURE_COMPENSATION_EDEFAULT;
        temperatureCompensationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_CAPABILITY__TEMPERATURE_COMPENSATION, oldTemperatureCompensation,
                TEMPERATURE_COMPENSATION_EDEFAULT, oldTemperatureCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTemperatureCompensation() {
        return temperatureCompensationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTextMessage() {
        return textMessage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTextMessage( Boolean newTextMessage ) {
        Boolean oldTextMessage = textMessage;
        textMessage = newTextMessage;
        boolean oldTextMessageESet = textMessageESet;
        textMessageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CAPABILITY__TEXT_MESSAGE, oldTextMessage, textMessage, !oldTextMessageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTextMessage() {
        Boolean oldTextMessage = textMessage;
        boolean oldTextMessageESet = textMessageESet;
        textMessage = TEXT_MESSAGE_EDEFAULT;
        textMessageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__TEXT_MESSAGE,
                    oldTextMessage, TEXT_MESSAGE_EDEFAULT, oldTextMessageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTextMessage() {
        return textMessageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getWaterMetering() {
        return waterMetering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWaterMetering( Boolean newWaterMetering ) {
        Boolean oldWaterMetering = waterMetering;
        waterMetering = newWaterMetering;
        boolean oldWaterMeteringESet = waterMeteringESet;
        waterMeteringESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CAPABILITY__WATER_METERING,
                    oldWaterMetering, waterMetering, !oldWaterMeteringESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWaterMetering() {
        Boolean oldWaterMetering = waterMetering;
        boolean oldWaterMeteringESet = waterMeteringESet;
        waterMetering = WATER_METERING_EDEFAULT;
        waterMeteringESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CAPABILITY__WATER_METERING,
                    oldWaterMetering, WATER_METERING_EDEFAULT, oldWaterMeteringESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWaterMetering() {
        return waterMeteringESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE_CAPABILITY__AUTONOMOUS_DST:
            return getAutonomousDst();
        case CimPackage.END_DEVICE_CAPABILITY__COMMUNICATION:
            return getCommunication();
        case CimPackage.END_DEVICE_CAPABILITY__CONNECT_DISCONNECT:
            return getConnectDisconnect();
        case CimPackage.END_DEVICE_CAPABILITY__DEMAND_RESPONSE:
            return getDemandResponse();
        case CimPackage.END_DEVICE_CAPABILITY__ELECTRIC_METERING:
            return getElectricMetering();
        case CimPackage.END_DEVICE_CAPABILITY__GAS_METERING:
            return getGasMetering();
        case CimPackage.END_DEVICE_CAPABILITY__METROLOGY:
            return getMetrology();
        case CimPackage.END_DEVICE_CAPABILITY__ON_REQUEST_READ:
            return getOnRequestRead();
        case CimPackage.END_DEVICE_CAPABILITY__OUTAGE_HISTORY:
            return getOutageHistory();
        case CimPackage.END_DEVICE_CAPABILITY__PRESSURE_COMPENSATION:
            return getPressureCompensation();
        case CimPackage.END_DEVICE_CAPABILITY__PRICING_INFO:
            return getPricingInfo();
        case CimPackage.END_DEVICE_CAPABILITY__PULSE_OUTPUT:
            return getPulseOutput();
        case CimPackage.END_DEVICE_CAPABILITY__RELAYS_PROGRAMMING:
            return getRelaysProgramming();
        case CimPackage.END_DEVICE_CAPABILITY__REVERSE_FLOW:
            return getReverseFlow();
        case CimPackage.END_DEVICE_CAPABILITY__SUPER_COMPRESSIBILITY_COMPENSATION:
            return getSuperCompressibilityCompensation();
        case CimPackage.END_DEVICE_CAPABILITY__TEMPERATURE_COMPENSATION:
            return getTemperatureCompensation();
        case CimPackage.END_DEVICE_CAPABILITY__TEXT_MESSAGE:
            return getTextMessage();
        case CimPackage.END_DEVICE_CAPABILITY__WATER_METERING:
            return getWaterMetering();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE_CAPABILITY__AUTONOMOUS_DST:
            setAutonomousDst( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__COMMUNICATION:
            setCommunication( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__CONNECT_DISCONNECT:
            setConnectDisconnect( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__DEMAND_RESPONSE:
            setDemandResponse( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__ELECTRIC_METERING:
            setElectricMetering( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__GAS_METERING:
            setGasMetering( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__METROLOGY:
            setMetrology( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__ON_REQUEST_READ:
            setOnRequestRead( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__OUTAGE_HISTORY:
            setOutageHistory( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__PRESSURE_COMPENSATION:
            setPressureCompensation( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__PRICING_INFO:
            setPricingInfo( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__PULSE_OUTPUT:
            setPulseOutput( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__RELAYS_PROGRAMMING:
            setRelaysProgramming( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__REVERSE_FLOW:
            setReverseFlow( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__SUPER_COMPRESSIBILITY_COMPENSATION:
            setSuperCompressibilityCompensation( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__TEMPERATURE_COMPENSATION:
            setTemperatureCompensation( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__TEXT_MESSAGE:
            setTextMessage( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CAPABILITY__WATER_METERING:
            setWaterMetering( ( Boolean ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE_CAPABILITY__AUTONOMOUS_DST:
            unsetAutonomousDst();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__COMMUNICATION:
            unsetCommunication();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__CONNECT_DISCONNECT:
            unsetConnectDisconnect();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__DEMAND_RESPONSE:
            unsetDemandResponse();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__ELECTRIC_METERING:
            unsetElectricMetering();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__GAS_METERING:
            unsetGasMetering();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__METROLOGY:
            unsetMetrology();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__ON_REQUEST_READ:
            unsetOnRequestRead();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__OUTAGE_HISTORY:
            unsetOutageHistory();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__PRESSURE_COMPENSATION:
            unsetPressureCompensation();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__PRICING_INFO:
            unsetPricingInfo();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__PULSE_OUTPUT:
            unsetPulseOutput();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__RELAYS_PROGRAMMING:
            unsetRelaysProgramming();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__REVERSE_FLOW:
            unsetReverseFlow();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__SUPER_COMPRESSIBILITY_COMPENSATION:
            unsetSuperCompressibilityCompensation();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__TEMPERATURE_COMPENSATION:
            unsetTemperatureCompensation();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__TEXT_MESSAGE:
            unsetTextMessage();
            return;
        case CimPackage.END_DEVICE_CAPABILITY__WATER_METERING:
            unsetWaterMetering();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE_CAPABILITY__AUTONOMOUS_DST:
            return isSetAutonomousDst();
        case CimPackage.END_DEVICE_CAPABILITY__COMMUNICATION:
            return isSetCommunication();
        case CimPackage.END_DEVICE_CAPABILITY__CONNECT_DISCONNECT:
            return isSetConnectDisconnect();
        case CimPackage.END_DEVICE_CAPABILITY__DEMAND_RESPONSE:
            return isSetDemandResponse();
        case CimPackage.END_DEVICE_CAPABILITY__ELECTRIC_METERING:
            return isSetElectricMetering();
        case CimPackage.END_DEVICE_CAPABILITY__GAS_METERING:
            return isSetGasMetering();
        case CimPackage.END_DEVICE_CAPABILITY__METROLOGY:
            return isSetMetrology();
        case CimPackage.END_DEVICE_CAPABILITY__ON_REQUEST_READ:
            return isSetOnRequestRead();
        case CimPackage.END_DEVICE_CAPABILITY__OUTAGE_HISTORY:
            return isSetOutageHistory();
        case CimPackage.END_DEVICE_CAPABILITY__PRESSURE_COMPENSATION:
            return isSetPressureCompensation();
        case CimPackage.END_DEVICE_CAPABILITY__PRICING_INFO:
            return isSetPricingInfo();
        case CimPackage.END_DEVICE_CAPABILITY__PULSE_OUTPUT:
            return isSetPulseOutput();
        case CimPackage.END_DEVICE_CAPABILITY__RELAYS_PROGRAMMING:
            return isSetRelaysProgramming();
        case CimPackage.END_DEVICE_CAPABILITY__REVERSE_FLOW:
            return isSetReverseFlow();
        case CimPackage.END_DEVICE_CAPABILITY__SUPER_COMPRESSIBILITY_COMPENSATION:
            return isSetSuperCompressibilityCompensation();
        case CimPackage.END_DEVICE_CAPABILITY__TEMPERATURE_COMPENSATION:
            return isSetTemperatureCompensation();
        case CimPackage.END_DEVICE_CAPABILITY__TEXT_MESSAGE:
            return isSetTextMessage();
        case CimPackage.END_DEVICE_CAPABILITY__WATER_METERING:
            return isSetWaterMetering();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (autonomousDst: " );
        if( autonomousDstESet )
            result.append( autonomousDst );
        else
            result.append( "<unset>" );
        result.append( ", communication: " );
        if( communicationESet )
            result.append( communication );
        else
            result.append( "<unset>" );
        result.append( ", connectDisconnect: " );
        if( connectDisconnectESet )
            result.append( connectDisconnect );
        else
            result.append( "<unset>" );
        result.append( ", demandResponse: " );
        if( demandResponseESet )
            result.append( demandResponse );
        else
            result.append( "<unset>" );
        result.append( ", electricMetering: " );
        if( electricMeteringESet )
            result.append( electricMetering );
        else
            result.append( "<unset>" );
        result.append( ", gasMetering: " );
        if( gasMeteringESet )
            result.append( gasMetering );
        else
            result.append( "<unset>" );
        result.append( ", metrology: " );
        if( metrologyESet )
            result.append( metrology );
        else
            result.append( "<unset>" );
        result.append( ", onRequestRead: " );
        if( onRequestReadESet )
            result.append( onRequestRead );
        else
            result.append( "<unset>" );
        result.append( ", outageHistory: " );
        if( outageHistoryESet )
            result.append( outageHistory );
        else
            result.append( "<unset>" );
        result.append( ", pressureCompensation: " );
        if( pressureCompensationESet )
            result.append( pressureCompensation );
        else
            result.append( "<unset>" );
        result.append( ", pricingInfo: " );
        if( pricingInfoESet )
            result.append( pricingInfo );
        else
            result.append( "<unset>" );
        result.append( ", pulseOutput: " );
        if( pulseOutputESet )
            result.append( pulseOutput );
        else
            result.append( "<unset>" );
        result.append( ", relaysProgramming: " );
        if( relaysProgrammingESet )
            result.append( relaysProgramming );
        else
            result.append( "<unset>" );
        result.append( ", reverseFlow: " );
        if( reverseFlowESet )
            result.append( reverseFlow );
        else
            result.append( "<unset>" );
        result.append( ", superCompressibilityCompensation: " );
        if( superCompressibilityCompensationESet )
            result.append( superCompressibilityCompensation );
        else
            result.append( "<unset>" );
        result.append( ", temperatureCompensation: " );
        if( temperatureCompensationESet )
            result.append( temperatureCompensation );
        else
            result.append( "<unset>" );
        result.append( ", textMessage: " );
        if( textMessageESet )
            result.append( textMessage );
        else
            result.append( "<unset>" );
        result.append( ", waterMetering: " );
        if( waterMeteringESet )
            result.append( waterMetering );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceCapabilityImpl
