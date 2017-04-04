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
 * A representation of the model object '<em><b>End Device Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramMandatory <em>Dr Program Mandatory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerID <em>Issuer ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerTrackingID <em>Issuer Tracking ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getReason <em>Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPriceSignal <em>Price Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPrimaryDeviceTiming <em>Primary Device Timing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getSecondaryDeviceTiming <em>Secondary Device Timing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceGroups <em>End Device Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceControlType <em>End Device Control Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getUsagePointGroups <em>Usage Point Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceAction <em>End Device Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getUsagePoints <em>Usage Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl()
 * @model
 * @generated
 */
public interface EndDeviceControl extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dr Program Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dr Program Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dr Program Level</em>' attribute.
     * @see #isSetDrProgramLevel()
     * @see #unsetDrProgramLevel()
     * @see #setDrProgramLevel(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_DrProgramLevel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.drProgramLevel' kind='element'"
     * @generated
     */
    Integer getDrProgramLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dr Program Level</em>' attribute.
     * @see #isSetDrProgramLevel()
     * @see #unsetDrProgramLevel()
     * @see #getDrProgramLevel()
     * @generated
     */
    void setDrProgramLevel( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrProgramLevel()
     * @see #getDrProgramLevel()
     * @see #setDrProgramLevel(Integer)
     * @generated
     */
    void unsetDrProgramLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dr Program Level</em>' attribute is set.
     * @see #unsetDrProgramLevel()
     * @see #getDrProgramLevel()
     * @see #setDrProgramLevel(Integer)
     * @generated
     */
    boolean isSetDrProgramLevel();

    /**
     * Returns the value of the '<em><b>Dr Program Mandatory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dr Program Mandatory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dr Program Mandatory</em>' attribute.
     * @see #isSetDrProgramMandatory()
     * @see #unsetDrProgramMandatory()
     * @see #setDrProgramMandatory(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_DrProgramMandatory()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.drProgramMandatory' kind='element'"
     * @generated
     */
    Boolean getDrProgramMandatory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramMandatory <em>Dr Program Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dr Program Mandatory</em>' attribute.
     * @see #isSetDrProgramMandatory()
     * @see #unsetDrProgramMandatory()
     * @see #getDrProgramMandatory()
     * @generated
     */
    void setDrProgramMandatory( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramMandatory <em>Dr Program Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrProgramMandatory()
     * @see #getDrProgramMandatory()
     * @see #setDrProgramMandatory(Boolean)
     * @generated
     */
    void unsetDrProgramMandatory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getDrProgramMandatory <em>Dr Program Mandatory</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dr Program Mandatory</em>' attribute is set.
     * @see #unsetDrProgramMandatory()
     * @see #getDrProgramMandatory()
     * @see #setDrProgramMandatory(Boolean)
     * @generated
     */
    boolean isSetDrProgramMandatory();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_IssuerID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.issuerID' kind='element'"
     * @generated
     */
    String getIssuerID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerID <em>Issuer ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerID <em>Issuer ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuerID()
     * @see #getIssuerID()
     * @see #setIssuerID(String)
     * @generated
     */
    void unsetIssuerID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerID <em>Issuer ID</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_IssuerTrackingID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.issuerTrackingID' kind='element'"
     * @generated
     */
    String getIssuerTrackingID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerTrackingID <em>Issuer Tracking ID</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerTrackingID <em>Issuer Tracking ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuerTrackingID()
     * @see #getIssuerTrackingID()
     * @see #setIssuerTrackingID(String)
     * @generated
     */
    void unsetIssuerTrackingID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getIssuerTrackingID <em>Issuer Tracking ID</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Reason</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reason</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reason</em>' attribute.
     * @see #isSetReason()
     * @see #unsetReason()
     * @see #setReason(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_Reason()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.reason' kind='element'"
     * @generated
     */
    String getReason();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getReason <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reason</em>' attribute.
     * @see #isSetReason()
     * @see #unsetReason()
     * @see #getReason()
     * @generated
     */
    void setReason( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getReason <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReason()
     * @see #getReason()
     * @see #setReason(String)
     * @generated
     */
    void unsetReason();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getReason <em>Reason</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reason</em>' attribute is set.
     * @see #unsetReason()
     * @see #getReason()
     * @see #setReason(String)
     * @generated
     */
    boolean isSetReason();

    /**
     * Returns the value of the '<em><b>Price Signal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price Signal</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Price Signal</em>' containment reference.
     * @see #isSetPriceSignal()
     * @see #unsetPriceSignal()
     * @see #setPriceSignal(FloatQuantity)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_PriceSignal()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.priceSignal' kind='element'"
     * @generated
     */
    FloatQuantity getPriceSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPriceSignal <em>Price Signal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Price Signal</em>' containment reference.
     * @see #isSetPriceSignal()
     * @see #unsetPriceSignal()
     * @see #getPriceSignal()
     * @generated
     */
    void setPriceSignal( FloatQuantity value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPriceSignal <em>Price Signal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriceSignal()
     * @see #getPriceSignal()
     * @see #setPriceSignal(FloatQuantity)
     * @generated
     */
    void unsetPriceSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPriceSignal <em>Price Signal</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Price Signal</em>' containment reference is set.
     * @see #unsetPriceSignal()
     * @see #getPriceSignal()
     * @see #setPriceSignal(FloatQuantity)
     * @generated
     */
    boolean isSetPriceSignal();

    /**
     * Returns the value of the '<em><b>Primary Device Timing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Primary Device Timing</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primary Device Timing</em>' containment reference.
     * @see #isSetPrimaryDeviceTiming()
     * @see #unsetPrimaryDeviceTiming()
     * @see #setPrimaryDeviceTiming(EndDeviceTiming)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_PrimaryDeviceTiming()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.primaryDeviceTiming' kind='element'"
     * @generated
     */
    EndDeviceTiming getPrimaryDeviceTiming();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPrimaryDeviceTiming <em>Primary Device Timing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primary Device Timing</em>' containment reference.
     * @see #isSetPrimaryDeviceTiming()
     * @see #unsetPrimaryDeviceTiming()
     * @see #getPrimaryDeviceTiming()
     * @generated
     */
    void setPrimaryDeviceTiming( EndDeviceTiming value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPrimaryDeviceTiming <em>Primary Device Timing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrimaryDeviceTiming()
     * @see #getPrimaryDeviceTiming()
     * @see #setPrimaryDeviceTiming(EndDeviceTiming)
     * @generated
     */
    void unsetPrimaryDeviceTiming();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getPrimaryDeviceTiming <em>Primary Device Timing</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Primary Device Timing</em>' containment reference is set.
     * @see #unsetPrimaryDeviceTiming()
     * @see #getPrimaryDeviceTiming()
     * @see #setPrimaryDeviceTiming(EndDeviceTiming)
     * @generated
     */
    boolean isSetPrimaryDeviceTiming();

    /**
     * Returns the value of the '<em><b>Scheduled Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduled Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduled Interval</em>' containment reference.
     * @see #isSetScheduledInterval()
     * @see #unsetScheduledInterval()
     * @see #setScheduledInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_ScheduledInterval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.scheduledInterval' kind='element'"
     * @generated
     */
    DateTimeInterval getScheduledInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scheduled Interval</em>' containment reference.
     * @see #isSetScheduledInterval()
     * @see #unsetScheduledInterval()
     * @see #getScheduledInterval()
     * @generated
     */
    void setScheduledInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScheduledInterval()
     * @see #getScheduledInterval()
     * @see #setScheduledInterval(DateTimeInterval)
     * @generated
     */
    void unsetScheduledInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scheduled Interval</em>' containment reference is set.
     * @see #unsetScheduledInterval()
     * @see #getScheduledInterval()
     * @see #setScheduledInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetScheduledInterval();

    /**
     * Returns the value of the '<em><b>Secondary Device Timing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Secondary Device Timing</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Secondary Device Timing</em>' containment reference.
     * @see #isSetSecondaryDeviceTiming()
     * @see #unsetSecondaryDeviceTiming()
     * @see #setSecondaryDeviceTiming(EndDeviceTiming)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_SecondaryDeviceTiming()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.secondaryDeviceTiming' kind='element'"
     * @generated
     */
    EndDeviceTiming getSecondaryDeviceTiming();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getSecondaryDeviceTiming <em>Secondary Device Timing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secondary Device Timing</em>' containment reference.
     * @see #isSetSecondaryDeviceTiming()
     * @see #unsetSecondaryDeviceTiming()
     * @see #getSecondaryDeviceTiming()
     * @generated
     */
    void setSecondaryDeviceTiming( EndDeviceTiming value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getSecondaryDeviceTiming <em>Secondary Device Timing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecondaryDeviceTiming()
     * @see #getSecondaryDeviceTiming()
     * @see #setSecondaryDeviceTiming(EndDeviceTiming)
     * @generated
     */
    void unsetSecondaryDeviceTiming();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getSecondaryDeviceTiming <em>Secondary Device Timing</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Secondary Device Timing</em>' containment reference is set.
     * @see #unsetSecondaryDeviceTiming()
     * @see #getSecondaryDeviceTiming()
     * @see #setSecondaryDeviceTiming(EndDeviceTiming)
     * @generated
     */
    boolean isSetSecondaryDeviceTiming();

    /**
     * Returns the value of the '<em><b>End Device Groups</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getEndDeviceControls <em>End Device Controls</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Groups</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Groups</em>' reference list.
     * @see #isSetEndDeviceGroups()
     * @see #unsetEndDeviceGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_EndDeviceGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getEndDeviceControls
     * @model opposite="EndDeviceControls" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.EndDeviceGroups' kind='element'"
     * @generated
     */
    EList< EndDeviceGroup > getEndDeviceGroups();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceGroups <em>End Device Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceGroups()
     * @see #getEndDeviceGroups()
     * @generated
     */
    void unsetEndDeviceGroups();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceGroups <em>End Device Groups</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Groups</em>' reference list is set.
     * @see #unsetEndDeviceGroups()
     * @see #getEndDeviceGroups()
     * @generated
     */
    boolean isSetEndDeviceGroups();

    /**
     * Returns the value of the '<em><b>End Device Control Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControlType#getEndDeviceControls <em>End Device Controls</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Control Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Control Type</em>' reference.
     * @see #isSetEndDeviceControlType()
     * @see #unsetEndDeviceControlType()
     * @see #setEndDeviceControlType(EndDeviceControlType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_EndDeviceControlType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControlType#getEndDeviceControls
     * @model opposite="EndDeviceControls" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.EndDeviceControlType' kind='element'"
     * @generated
     */
    EndDeviceControlType getEndDeviceControlType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceControlType <em>End Device Control Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Control Type</em>' reference.
     * @see #isSetEndDeviceControlType()
     * @see #unsetEndDeviceControlType()
     * @see #getEndDeviceControlType()
     * @generated
     */
    void setEndDeviceControlType( EndDeviceControlType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceControlType <em>End Device Control Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceControlType()
     * @see #getEndDeviceControlType()
     * @see #setEndDeviceControlType(EndDeviceControlType)
     * @generated
     */
    void unsetEndDeviceControlType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceControlType <em>End Device Control Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Control Type</em>' reference is set.
     * @see #unsetEndDeviceControlType()
     * @see #getEndDeviceControlType()
     * @see #setEndDeviceControlType(EndDeviceControlType)
     * @generated
     */
    boolean isSetEndDeviceControlType();

    /**
     * Returns the value of the '<em><b>Usage Point Groups</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointGroup#getEndDeviceControls <em>End Device Controls</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Point Groups</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Point Groups</em>' reference list.
     * @see #isSetUsagePointGroups()
     * @see #unsetUsagePointGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_UsagePointGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointGroup#getEndDeviceControls
     * @model opposite="EndDeviceControls" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.UsagePointGroups' kind='element'"
     * @generated
     */
    EList< UsagePointGroup > getUsagePointGroups();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getUsagePointGroups <em>Usage Point Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePointGroups()
     * @see #getUsagePointGroups()
     * @generated
     */
    void unsetUsagePointGroups();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getUsagePointGroups <em>Usage Point Groups</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Point Groups</em>' reference list is set.
     * @see #unsetUsagePointGroups()
     * @see #getUsagePointGroups()
     * @generated
     */
    boolean isSetUsagePointGroups();

    /**
     * Returns the value of the '<em><b>End Device Action</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getEndDeviceControl <em>End Device Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Action</em>' reference.
     * @see #isSetEndDeviceAction()
     * @see #unsetEndDeviceAction()
     * @see #setEndDeviceAction(EndDeviceAction)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_EndDeviceAction()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction#getEndDeviceControl
     * @model opposite="EndDeviceControl" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.EndDeviceAction' kind='element'"
     * @generated
     */
    EndDeviceAction getEndDeviceAction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceAction <em>End Device Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Action</em>' reference.
     * @see #isSetEndDeviceAction()
     * @see #unsetEndDeviceAction()
     * @see #getEndDeviceAction()
     * @generated
     */
    void setEndDeviceAction( EndDeviceAction value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceAction <em>End Device Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceAction()
     * @see #getEndDeviceAction()
     * @see #setEndDeviceAction(EndDeviceAction)
     * @generated
     */
    void unsetEndDeviceAction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDeviceAction <em>End Device Action</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Action</em>' reference is set.
     * @see #unsetEndDeviceAction()
     * @see #getEndDeviceAction()
     * @see #setEndDeviceAction(EndDeviceAction)
     * @generated
     */
    boolean isSetEndDeviceAction();

    /**
     * Returns the value of the '<em><b>End Devices</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceControls <em>End Device Controls</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Devices</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Devices</em>' reference list.
     * @see #isSetEndDevices()
     * @see #unsetEndDevices()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_EndDevices()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceControls
     * @model opposite="EndDeviceControls" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.EndDevices' kind='element'"
     * @generated
     */
    EList< EndDevice > getEndDevices();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDevices <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDevices()
     * @see #getEndDevices()
     * @generated
     */
    void unsetEndDevices();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDevices <em>End Devices</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Devices</em>' reference list is set.
     * @see #unsetEndDevices()
     * @see #getEndDevices()
     * @generated
     */
    boolean isSetEndDevices();

    /**
     * Returns the value of the '<em><b>Usage Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEndDeviceControls <em>End Device Controls</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Points</em>' reference list.
     * @see #isSetUsagePoints()
     * @see #unsetUsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDeviceControl_UsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEndDeviceControls
     * @model opposite="EndDeviceControls" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDeviceControl.UsagePoints' kind='element'"
     * @generated
     */
    EList< UsagePoint > getUsagePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getUsagePoints <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    void unsetUsagePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getUsagePoints <em>Usage Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Points</em>' reference list is set.
     * @see #unsetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    boolean isSetUsagePoints();

} // EndDeviceControl
