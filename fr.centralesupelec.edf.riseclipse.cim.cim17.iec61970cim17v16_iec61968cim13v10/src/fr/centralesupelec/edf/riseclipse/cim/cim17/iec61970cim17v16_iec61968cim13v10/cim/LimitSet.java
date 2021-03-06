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
 * A representation of the model object '<em><b>Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLimitSet()
 * @model
 * @generated
 */
public interface LimitSet extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Is Percentage Limits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Percentage Limits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Percentage Limits</em>' attribute.
     * @see #isSetIsPercentageLimits()
     * @see #unsetIsPercentageLimits()
     * @see #setIsPercentageLimits(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLimitSet_IsPercentageLimits()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LimitSet.isPercentageLimits' kind='element'"
     * @generated
     */
    Boolean getIsPercentageLimits();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Percentage Limits</em>' attribute.
     * @see #isSetIsPercentageLimits()
     * @see #unsetIsPercentageLimits()
     * @see #getIsPercentageLimits()
     * @generated
     */
    void setIsPercentageLimits( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPercentageLimits()
     * @see #getIsPercentageLimits()
     * @see #setIsPercentageLimits(Boolean)
     * @generated
     */
    void unsetIsPercentageLimits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Percentage Limits</em>' attribute is set.
     * @see #unsetIsPercentageLimits()
     * @see #getIsPercentageLimits()
     * @see #setIsPercentageLimits(Boolean)
     * @generated
     */
    boolean isSetIsPercentageLimits();

} // LimitSet
