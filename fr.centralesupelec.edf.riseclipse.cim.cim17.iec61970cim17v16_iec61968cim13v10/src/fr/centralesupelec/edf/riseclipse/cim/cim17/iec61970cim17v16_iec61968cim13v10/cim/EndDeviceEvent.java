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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerID <em>Issuer ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerTrackingID <em>Issuer Tracking ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUserID <em>User ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDevice <em>End Device</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDeviceEventType <em>End Device Event Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDeviceEventDetails <em>End Device Event Details</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUsagePoint <em>Usage Point</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent()
 * @model
 * @generated
 */
public interface EndDeviceEvent extends ActivityRecord {
    /**
     * Returns the value of the '<em><b>Issuer ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issuer ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issuer ID</em>' attribute.
     * @see #isSetIssuerID()
     * @see #unsetIssuerID()
     * @see #setIssuerID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_IssuerID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.issuerID' kind='element'"
     * @generated
     */
    String getIssuerID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerID <em>Issuer ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issuer ID</em>' attribute.
     * @see #isSetIssuerID()
     * @see #unsetIssuerID()
     * @see #getIssuerID()
     * @generated
     */
    void setIssuerID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerID <em>Issuer ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuerID()
     * @see #getIssuerID()
     * @see #setIssuerID(String)
     * @generated
     */
    void unsetIssuerID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerID <em>Issuer ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Issuer ID</em>' attribute is set.
     * @see #unsetIssuerID()
     * @see #getIssuerID()
     * @see #setIssuerID(String)
     * @generated
     */
    boolean isSetIssuerID();

    /**
     * Returns the value of the '<em><b>Issuer Tracking ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issuer Tracking ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issuer Tracking ID</em>' attribute.
     * @see #isSetIssuerTrackingID()
     * @see #unsetIssuerTrackingID()
     * @see #setIssuerTrackingID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_IssuerTrackingID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.issuerTrackingID' kind='element'"
     * @generated
     */
    String getIssuerTrackingID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerTrackingID <em>Issuer Tracking ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issuer Tracking ID</em>' attribute.
     * @see #isSetIssuerTrackingID()
     * @see #unsetIssuerTrackingID()
     * @see #getIssuerTrackingID()
     * @generated
     */
    void setIssuerTrackingID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerTrackingID <em>Issuer Tracking ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuerTrackingID()
     * @see #getIssuerTrackingID()
     * @see #setIssuerTrackingID(String)
     * @generated
     */
    void unsetIssuerTrackingID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getIssuerTrackingID <em>Issuer Tracking ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Issuer Tracking ID</em>' attribute is set.
     * @see #unsetIssuerTrackingID()
     * @see #getIssuerTrackingID()
     * @see #setIssuerTrackingID(String)
     * @generated
     */
    boolean isSetIssuerTrackingID();

    /**
     * Returns the value of the '<em><b>User ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User ID</em>' attribute.
     * @see #isSetUserID()
     * @see #unsetUserID()
     * @see #setUserID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_UserID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.userID' kind='element'"
     * @generated
     */
    String getUserID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUserID <em>User ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User ID</em>' attribute.
     * @see #isSetUserID()
     * @see #unsetUserID()
     * @see #getUserID()
     * @generated
     */
    void setUserID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUserID <em>User ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUserID()
     * @see #getUserID()
     * @see #setUserID(String)
     * @generated
     */
    void unsetUserID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUserID <em>User ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>User ID</em>' attribute is set.
     * @see #unsetUserID()
     * @see #getUserID()
     * @see #setUserID(String)
     * @generated
     */
    boolean isSetUserID();

    /**
     * Returns the value of the '<em><b>End Device</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceEvents <em>End Device Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device</em>' reference.
     * @see #isSetEndDevice()
     * @see #unsetEndDevice()
     * @see #setEndDevice(EndDevice)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_EndDevice()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceEvents
     * @model opposite="EndDeviceEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.EndDevice' kind='element'"
     * @generated
     */
    EndDevice getEndDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDevice <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device</em>' reference.
     * @see #isSetEndDevice()
     * @see #unsetEndDevice()
     * @see #getEndDevice()
     * @generated
     */
    void setEndDevice( EndDevice value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDevice <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDevice()
     * @see #getEndDevice()
     * @see #setEndDevice(EndDevice)
     * @generated
     */
    void unsetEndDevice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDevice <em>End Device</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device</em>' reference is set.
     * @see #unsetEndDevice()
     * @see #getEndDevice()
     * @see #setEndDevice(EndDevice)
     * @generated
     */
    boolean isSetEndDevice();

    /**
     * Returns the value of the '<em><b>End Device Event Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventType#getEndDeviceEvents <em>End Device Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Event Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Event Type</em>' reference.
     * @see #isSetEndDeviceEventType()
     * @see #unsetEndDeviceEventType()
     * @see #setEndDeviceEventType(EndDeviceEventType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_EndDeviceEventType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventType#getEndDeviceEvents
     * @model opposite="EndDeviceEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.EndDeviceEventType' kind='element'"
     * @generated
     */
    EndDeviceEventType getEndDeviceEventType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDeviceEventType <em>End Device Event Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Event Type</em>' reference.
     * @see #isSetEndDeviceEventType()
     * @see #unsetEndDeviceEventType()
     * @see #getEndDeviceEventType()
     * @generated
     */
    void setEndDeviceEventType( EndDeviceEventType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDeviceEventType <em>End Device Event Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceEventType()
     * @see #getEndDeviceEventType()
     * @see #setEndDeviceEventType(EndDeviceEventType)
     * @generated
     */
    void unsetEndDeviceEventType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDeviceEventType <em>End Device Event Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Event Type</em>' reference is set.
     * @see #unsetEndDeviceEventType()
     * @see #getEndDeviceEventType()
     * @see #setEndDeviceEventType(EndDeviceEventType)
     * @generated
     */
    boolean isSetEndDeviceEventType();

    /**
     * Returns the value of the '<em><b>End Device Event Details</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventDetail}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventDetail#getEndDeviceEvent <em>End Device Event</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Event Details</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Event Details</em>' reference list.
     * @see #isSetEndDeviceEventDetails()
     * @see #unsetEndDeviceEventDetails()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_EndDeviceEventDetails()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventDetail#getEndDeviceEvent
     * @model opposite="EndDeviceEvent" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.EndDeviceEventDetails' kind='element'"
     * @generated
     */
    EList< EndDeviceEventDetail > getEndDeviceEventDetails();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDeviceEventDetails <em>End Device Event Details</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceEventDetails()
     * @see #getEndDeviceEventDetails()
     * @generated
     */
    void unsetEndDeviceEventDetails();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDeviceEventDetails <em>End Device Event Details</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Event Details</em>' reference list is set.
     * @see #unsetEndDeviceEventDetails()
     * @see #getEndDeviceEventDetails()
     * @generated
     */
    boolean isSetEndDeviceEventDetails();

    /**
     * Returns the value of the '<em><b>Meter Reading</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading#getEndDeviceEvents <em>End Device Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter Reading</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter Reading</em>' reference.
     * @see #isSetMeterReading()
     * @see #unsetMeterReading()
     * @see #setMeterReading(MeterReading)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_MeterReading()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading#getEndDeviceEvents
     * @model opposite="EndDeviceEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.MeterReading' kind='element'"
     * @generated
     */
    MeterReading getMeterReading();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meter Reading</em>' reference.
     * @see #isSetMeterReading()
     * @see #unsetMeterReading()
     * @see #getMeterReading()
     * @generated
     */
    void setMeterReading( MeterReading value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeterReading()
     * @see #getMeterReading()
     * @see #setMeterReading(MeterReading)
     * @generated
     */
    void unsetMeterReading();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter Reading</em>' reference is set.
     * @see #unsetMeterReading()
     * @see #getMeterReading()
     * @see #setMeterReading(MeterReading)
     * @generated
     */
    boolean isSetMeterReading();

    /**
     * Returns the value of the '<em><b>Usage Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEndDeviceEvents <em>End Device Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceEvent_UsagePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEndDeviceEvents
     * @model opposite="EndDeviceEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceEvent.UsagePoint' kind='element'"
     * @generated
     */
    UsagePoint getUsagePoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @generated
     */
    void setUsagePoint( UsagePoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    void unsetUsagePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getUsagePoint <em>Usage Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Point</em>' reference is set.
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    boolean isSetUsagePoint();

} // EndDeviceEvent
