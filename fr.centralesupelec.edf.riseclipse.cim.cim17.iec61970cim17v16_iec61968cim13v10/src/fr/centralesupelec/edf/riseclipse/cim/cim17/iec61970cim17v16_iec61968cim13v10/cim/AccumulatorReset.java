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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accumulator Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorReset()
 * @model
 * @generated
 */
public interface AccumulatorReset extends Control {
    /**
     * Returns the value of the '<em><b>Accumulator Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accumulator Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accumulator Value</em>' reference.
     * @see #isSetAccumulatorValue()
     * @see #unsetAccumulatorValue()
     * @see #setAccumulatorValue(AccumulatorValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorReset_AccumulatorValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulatorReset
     * @model opposite="AccumulatorReset" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccumulatorReset.AccumulatorValue' kind='element'"
     * @generated
     */
    AccumulatorValue getAccumulatorValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulator Value</em>' reference.
     * @see #isSetAccumulatorValue()
     * @see #unsetAccumulatorValue()
     * @see #getAccumulatorValue()
     * @generated
     */
    void setAccumulatorValue( AccumulatorValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulatorValue()
     * @see #getAccumulatorValue()
     * @see #setAccumulatorValue(AccumulatorValue)
     * @generated
     */
    void unsetAccumulatorValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulator Value</em>' reference is set.
     * @see #unsetAccumulatorValue()
     * @see #getAccumulatorValue()
     * @see #setAccumulatorValue(AccumulatorValue)
     * @generated
     */
    boolean isSetAccumulatorValue();

} // AccumulatorReset
