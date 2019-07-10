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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HealthScore#getAssetRiskScore <em>Asset Risk Score</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHealthScore()
 * @model
 * @generated
 */
public interface HealthScore extends AggregateScore {
    /**
     * Returns the value of the '<em><b>Asset Risk Score</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RiskScore#getAssetHealthScore <em>Asset Health Score</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Risk Score</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Risk Score</em>' reference.
     * @see #isSetAssetRiskScore()
     * @see #unsetAssetRiskScore()
     * @see #setAssetRiskScore(RiskScore)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHealthScore_AssetRiskScore()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RiskScore#getAssetHealthScore
     * @model opposite="AssetHealthScore" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HealthScore.AssetRiskScore' kind='element'"
     * @generated
     */
    RiskScore getAssetRiskScore();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HealthScore#getAssetRiskScore <em>Asset Risk Score</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Risk Score</em>' reference.
     * @see #isSetAssetRiskScore()
     * @see #unsetAssetRiskScore()
     * @see #getAssetRiskScore()
     * @generated
     */
    void setAssetRiskScore( RiskScore value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HealthScore#getAssetRiskScore <em>Asset Risk Score</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetRiskScore()
     * @see #getAssetRiskScore()
     * @see #setAssetRiskScore(RiskScore)
     * @generated
     */
    void unsetAssetRiskScore();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HealthScore#getAssetRiskScore <em>Asset Risk Score</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Risk Score</em>' reference is set.
     * @see #unsetAssetRiskScore()
     * @see #getAssetRiskScore()
     * @see #setAssetRiskScore(RiskScore)
     * @generated
     */
    boolean isSetAssetRiskScore();

} // HealthScore
