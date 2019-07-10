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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getBreakerFailureReason <em>Breaker Failure Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureClassification <em>Failure Classification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureDateTime <em>Failure Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getTransformerFailureReason <em>Transformer Failure Reason</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent()
 * @model
 * @generated
 */
public interface FailureEvent extends ActivityRecord {
    /**
     * Returns the value of the '<em><b>Breaker Failure Reason</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerFailureReasonKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaker Failure Reason</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaker Failure Reason</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerFailureReasonKind
     * @see #isSetBreakerFailureReason()
     * @see #unsetBreakerFailureReason()
     * @see #setBreakerFailureReason(BreakerFailureReasonKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_BreakerFailureReason()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.breakerFailureReason' kind='element'"
     * @generated
     */
    BreakerFailureReasonKind getBreakerFailureReason();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getBreakerFailureReason <em>Breaker Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaker Failure Reason</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerFailureReasonKind
     * @see #isSetBreakerFailureReason()
     * @see #unsetBreakerFailureReason()
     * @see #getBreakerFailureReason()
     * @generated
     */
    void setBreakerFailureReason( BreakerFailureReasonKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getBreakerFailureReason <em>Breaker Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakerFailureReason()
     * @see #getBreakerFailureReason()
     * @see #setBreakerFailureReason(BreakerFailureReasonKind)
     * @generated
     */
    void unsetBreakerFailureReason();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getBreakerFailureReason <em>Breaker Failure Reason</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaker Failure Reason</em>' attribute is set.
     * @see #unsetBreakerFailureReason()
     * @see #getBreakerFailureReason()
     * @see #setBreakerFailureReason(BreakerFailureReasonKind)
     * @generated
     */
    boolean isSetBreakerFailureReason();

    /**
     * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Corporate Code</em>' attribute.
     * @see #isSetCorporateCode()
     * @see #unsetCorporateCode()
     * @see #setCorporateCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_CorporateCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.corporateCode' kind='element'"
     * @generated
     */
    String getCorporateCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getCorporateCode <em>Corporate Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Corporate Code</em>' attribute.
     * @see #isSetCorporateCode()
     * @see #unsetCorporateCode()
     * @see #getCorporateCode()
     * @generated
     */
    void setCorporateCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getCorporateCode <em>Corporate Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCorporateCode()
     * @see #getCorporateCode()
     * @see #setCorporateCode(String)
     * @generated
     */
    void unsetCorporateCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getCorporateCode <em>Corporate Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Corporate Code</em>' attribute is set.
     * @see #unsetCorporateCode()
     * @see #getCorporateCode()
     * @see #setCorporateCode(String)
     * @generated
     */
    boolean isSetCorporateCode();

    /**
     * Returns the value of the '<em><b>Failure Classification</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureClassification}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Failure Classification</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Failure Classification</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureClassification
     * @see #isSetFailureClassification()
     * @see #unsetFailureClassification()
     * @see #setFailureClassification(AssetFailureClassification)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_FailureClassification()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.failureClassification' kind='element'"
     * @generated
     */
    AssetFailureClassification getFailureClassification();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureClassification <em>Failure Classification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Failure Classification</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureClassification
     * @see #isSetFailureClassification()
     * @see #unsetFailureClassification()
     * @see #getFailureClassification()
     * @generated
     */
    void setFailureClassification( AssetFailureClassification value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureClassification <em>Failure Classification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFailureClassification()
     * @see #getFailureClassification()
     * @see #setFailureClassification(AssetFailureClassification)
     * @generated
     */
    void unsetFailureClassification();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureClassification <em>Failure Classification</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Failure Classification</em>' attribute is set.
     * @see #unsetFailureClassification()
     * @see #getFailureClassification()
     * @see #setFailureClassification(AssetFailureClassification)
     * @generated
     */
    boolean isSetFailureClassification();

    /**
     * Returns the value of the '<em><b>Failure Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Failure Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Failure Date Time</em>' attribute.
     * @see #isSetFailureDateTime()
     * @see #unsetFailureDateTime()
     * @see #setFailureDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_FailureDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.failureDateTime' kind='element'"
     * @generated
     */
    Date getFailureDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureDateTime <em>Failure Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Failure Date Time</em>' attribute.
     * @see #isSetFailureDateTime()
     * @see #unsetFailureDateTime()
     * @see #getFailureDateTime()
     * @generated
     */
    void setFailureDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureDateTime <em>Failure Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFailureDateTime()
     * @see #getFailureDateTime()
     * @see #setFailureDateTime(Date)
     * @generated
     */
    void unsetFailureDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureDateTime <em>Failure Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Failure Date Time</em>' attribute is set.
     * @see #unsetFailureDateTime()
     * @see #getFailureDateTime()
     * @see #setFailureDateTime(Date)
     * @generated
     */
    boolean isSetFailureDateTime();

    /**
     * Returns the value of the '<em><b>Failure Isolation Method</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureIsolationMethodKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Failure Isolation Method</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Failure Isolation Method</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureIsolationMethodKind
     * @see #isSetFailureIsolationMethod()
     * @see #unsetFailureIsolationMethod()
     * @see #setFailureIsolationMethod(FailureIsolationMethodKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_FailureIsolationMethod()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.failureIsolationMethod' kind='element'"
     * @generated
     */
    FailureIsolationMethodKind getFailureIsolationMethod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Failure Isolation Method</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureIsolationMethodKind
     * @see #isSetFailureIsolationMethod()
     * @see #unsetFailureIsolationMethod()
     * @see #getFailureIsolationMethod()
     * @generated
     */
    void setFailureIsolationMethod( FailureIsolationMethodKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFailureIsolationMethod()
     * @see #getFailureIsolationMethod()
     * @see #setFailureIsolationMethod(FailureIsolationMethodKind)
     * @generated
     */
    void unsetFailureIsolationMethod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Failure Isolation Method</em>' attribute is set.
     * @see #unsetFailureIsolationMethod()
     * @see #getFailureIsolationMethod()
     * @see #setFailureIsolationMethod(FailureIsolationMethodKind)
     * @generated
     */
    boolean isSetFailureIsolationMethod();

    /**
     * Returns the value of the '<em><b>Failure Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureMode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Failure Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Failure Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureMode
     * @see #isSetFailureMode()
     * @see #unsetFailureMode()
     * @see #setFailureMode(AssetFailureMode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_FailureMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.failureMode' kind='element'"
     * @generated
     */
    AssetFailureMode getFailureMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureMode <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Failure Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureMode
     * @see #isSetFailureMode()
     * @see #unsetFailureMode()
     * @see #getFailureMode()
     * @generated
     */
    void setFailureMode( AssetFailureMode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureMode <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFailureMode()
     * @see #getFailureMode()
     * @see #setFailureMode(AssetFailureMode)
     * @generated
     */
    void unsetFailureMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFailureMode <em>Failure Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Failure Mode</em>' attribute is set.
     * @see #unsetFailureMode()
     * @see #getFailureMode()
     * @see #setFailureMode(AssetFailureMode)
     * @generated
     */
    boolean isSetFailureMode();

    /**
     * Returns the value of the '<em><b>Fault Locating Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fault Locating Method</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fault Locating Method</em>' attribute.
     * @see #isSetFaultLocatingMethod()
     * @see #unsetFaultLocatingMethod()
     * @see #setFaultLocatingMethod(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_FaultLocatingMethod()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.faultLocatingMethod' kind='element'"
     * @generated
     */
    String getFaultLocatingMethod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fault Locating Method</em>' attribute.
     * @see #isSetFaultLocatingMethod()
     * @see #unsetFaultLocatingMethod()
     * @see #getFaultLocatingMethod()
     * @generated
     */
    void setFaultLocatingMethod( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFaultLocatingMethod()
     * @see #getFaultLocatingMethod()
     * @see #setFaultLocatingMethod(String)
     * @generated
     */
    void unsetFaultLocatingMethod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fault Locating Method</em>' attribute is set.
     * @see #unsetFaultLocatingMethod()
     * @see #getFaultLocatingMethod()
     * @see #setFaultLocatingMethod(String)
     * @generated
     */
    boolean isSetFaultLocatingMethod();

    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #setLocation(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_Location()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.location' kind='element'"
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #getLocation()
     * @generated
     */
    void setLocation( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocation()
     * @see #getLocation()
     * @see #setLocation(String)
     * @generated
     */
    void unsetLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getLocation <em>Location</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Location</em>' attribute is set.
     * @see #unsetLocation()
     * @see #getLocation()
     * @see #setLocation(String)
     * @generated
     */
    boolean isSetLocation();

    /**
     * Returns the value of the '<em><b>Root Cause</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Cause</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Cause</em>' attribute.
     * @see #isSetRootCause()
     * @see #unsetRootCause()
     * @see #setRootCause(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_RootCause()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.rootCause' kind='element'"
     * @generated
     */
    String getRootCause();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getRootCause <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Cause</em>' attribute.
     * @see #isSetRootCause()
     * @see #unsetRootCause()
     * @see #getRootCause()
     * @generated
     */
    void setRootCause( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getRootCause <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRootCause()
     * @see #getRootCause()
     * @see #setRootCause(String)
     * @generated
     */
    void unsetRootCause();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getRootCause <em>Root Cause</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Root Cause</em>' attribute is set.
     * @see #unsetRootCause()
     * @see #getRootCause()
     * @see #setRootCause(String)
     * @generated
     */
    boolean isSetRootCause();

    /**
     * Returns the value of the '<em><b>Transformer Failure Reason</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerFailureReasonKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Failure Reason</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer Failure Reason</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerFailureReasonKind
     * @see #isSetTransformerFailureReason()
     * @see #unsetTransformerFailureReason()
     * @see #setTransformerFailureReason(TransformerFailureReasonKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFailureEvent_TransformerFailureReason()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FailureEvent.transformerFailureReason' kind='element'"
     * @generated
     */
    TransformerFailureReasonKind getTransformerFailureReason();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getTransformerFailureReason <em>Transformer Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer Failure Reason</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerFailureReasonKind
     * @see #isSetTransformerFailureReason()
     * @see #unsetTransformerFailureReason()
     * @see #getTransformerFailureReason()
     * @generated
     */
    void setTransformerFailureReason( TransformerFailureReasonKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getTransformerFailureReason <em>Transformer Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerFailureReason()
     * @see #getTransformerFailureReason()
     * @see #setTransformerFailureReason(TransformerFailureReasonKind)
     * @generated
     */
    void unsetTransformerFailureReason();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent#getTransformerFailureReason <em>Transformer Failure Reason</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer Failure Reason</em>' attribute is set.
     * @see #unsetTransformerFailureReason()
     * @see #getTransformerFailureReason()
     * @see #setTransformerFailureReason(TransformerFailureReasonKind)
     * @generated
     */
    boolean isSetTransformerFailureReason();

} // FailureEvent
