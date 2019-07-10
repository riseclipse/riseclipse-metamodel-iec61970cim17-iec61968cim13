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
 * A representation of the model object '<em><b>Asset Health Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionRecommendation <em>Action Recommendation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionTimeline <em>Action Timeline</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getAnalytic <em>Analytic</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetHealthEvent()
 * @model
 * @generated
 */
public interface AssetHealthEvent extends ActivityRecord {
    /**
     * Returns the value of the '<em><b>Action Recommendation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action Recommendation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action Recommendation</em>' attribute.
     * @see #isSetActionRecommendation()
     * @see #unsetActionRecommendation()
     * @see #setActionRecommendation(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetHealthEvent_ActionRecommendation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetHealthEvent.actionRecommendation' kind='element'"
     * @generated
     */
    String getActionRecommendation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionRecommendation <em>Action Recommendation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action Recommendation</em>' attribute.
     * @see #isSetActionRecommendation()
     * @see #unsetActionRecommendation()
     * @see #getActionRecommendation()
     * @generated
     */
    void setActionRecommendation( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionRecommendation <em>Action Recommendation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActionRecommendation()
     * @see #getActionRecommendation()
     * @see #setActionRecommendation(String)
     * @generated
     */
    void unsetActionRecommendation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionRecommendation <em>Action Recommendation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Action Recommendation</em>' attribute is set.
     * @see #unsetActionRecommendation()
     * @see #getActionRecommendation()
     * @see #setActionRecommendation(String)
     * @generated
     */
    boolean isSetActionRecommendation();

    /**
     * Returns the value of the '<em><b>Action Timeline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action Timeline</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action Timeline</em>' attribute.
     * @see #isSetActionTimeline()
     * @see #unsetActionTimeline()
     * @see #setActionTimeline(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetHealthEvent_ActionTimeline()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetHealthEvent.actionTimeline' kind='element'"
     * @generated
     */
    String getActionTimeline();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionTimeline <em>Action Timeline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action Timeline</em>' attribute.
     * @see #isSetActionTimeline()
     * @see #unsetActionTimeline()
     * @see #getActionTimeline()
     * @generated
     */
    void setActionTimeline( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionTimeline <em>Action Timeline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActionTimeline()
     * @see #getActionTimeline()
     * @see #setActionTimeline(String)
     * @generated
     */
    void unsetActionTimeline();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getActionTimeline <em>Action Timeline</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Action Timeline</em>' attribute is set.
     * @see #unsetActionTimeline()
     * @see #getActionTimeline()
     * @see #setActionTimeline(String)
     * @generated
     */
    boolean isSetActionTimeline();

    /**
     * Returns the value of the '<em><b>Effective Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effective Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effective Date Time</em>' attribute.
     * @see #isSetEffectiveDateTime()
     * @see #unsetEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetHealthEvent_EffectiveDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetHealthEvent.effectiveDateTime' kind='element'"
     * @generated
     */
    Date getEffectiveDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Effective Date Time</em>' attribute.
     * @see #isSetEffectiveDateTime()
     * @see #unsetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @generated
     */
    void setEffectiveDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @generated
     */
    void unsetEffectiveDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getEffectiveDateTime <em>Effective Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Effective Date Time</em>' attribute is set.
     * @see #unsetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @generated
     */
    boolean isSetEffectiveDateTime();

    /**
     * Returns the value of the '<em><b>Analytic</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic#getAssetHealthEvent <em>Asset Health Event</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analytic</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analytic</em>' reference.
     * @see #isSetAnalytic()
     * @see #unsetAnalytic()
     * @see #setAnalytic(Analytic)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetHealthEvent_Analytic()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic#getAssetHealthEvent
     * @model opposite="AssetHealthEvent" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetHealthEvent.Analytic' kind='element'"
     * @generated
     */
    Analytic getAnalytic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getAnalytic <em>Analytic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analytic</em>' reference.
     * @see #isSetAnalytic()
     * @see #unsetAnalytic()
     * @see #getAnalytic()
     * @generated
     */
    void setAnalytic( Analytic value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getAnalytic <em>Analytic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalytic()
     * @see #getAnalytic()
     * @see #setAnalytic(Analytic)
     * @generated
     */
    void unsetAnalytic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetHealthEvent#getAnalytic <em>Analytic</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analytic</em>' reference is set.
     * @see #unsetAnalytic()
     * @see #getAnalytic()
     * @see #setAnalytic(Analytic)
     * @generated
     */
    boolean isSetAnalytic();

} // AssetHealthEvent
