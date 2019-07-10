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
 * A representation of the model object '<em><b>Reading Interharmonic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getNumerator <em>Numerator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingInterharmonic()
 * @model
 * @generated
 */
public interface ReadingInterharmonic extends EObject {
    /**
     * Returns the value of the '<em><b>Denominator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Denominator</em>' attribute.
     * @see #isSetDenominator()
     * @see #unsetDenominator()
     * @see #setDenominator(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingInterharmonic_Denominator()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReadingInterharmonic.denominator' kind='element'"
     * @generated
     */
    Integer getDenominator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getDenominator <em>Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Denominator</em>' attribute.
     * @see #isSetDenominator()
     * @see #unsetDenominator()
     * @see #getDenominator()
     * @generated
     */
    void setDenominator( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getDenominator <em>Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDenominator()
     * @see #getDenominator()
     * @see #setDenominator(Integer)
     * @generated
     */
    void unsetDenominator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getDenominator <em>Denominator</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Denominator</em>' attribute is set.
     * @see #unsetDenominator()
     * @see #getDenominator()
     * @see #setDenominator(Integer)
     * @generated
     */
    boolean isSetDenominator();

    /**
     * Returns the value of the '<em><b>Numerator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numerator</em>' attribute.
     * @see #isSetNumerator()
     * @see #unsetNumerator()
     * @see #setNumerator(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingInterharmonic_Numerator()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReadingInterharmonic.numerator' kind='element'"
     * @generated
     */
    Integer getNumerator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getNumerator <em>Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Numerator</em>' attribute.
     * @see #isSetNumerator()
     * @see #unsetNumerator()
     * @see #getNumerator()
     * @generated
     */
    void setNumerator( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getNumerator <em>Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNumerator()
     * @see #getNumerator()
     * @see #setNumerator(Integer)
     * @generated
     */
    void unsetNumerator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic#getNumerator <em>Numerator</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Numerator</em>' attribute is set.
     * @see #unsetNumerator()
     * @see #getNumerator()
     * @see #setNumerator(Integer)
     * @generated
     */
    boolean isSetNumerator();

} // ReadingInterharmonic
