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
 * A representation of the model object '<em><b>Accumulator Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorValue()
 * @model
 * @generated
 */
public interface AccumulatorValue extends MeasurementValue {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorValue_Value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccumulatorValue.value' kind='element'"
     * @generated
     */
    Integer getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(Integer)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(Integer)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Accumulator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accumulator</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accumulator</em>' reference.
     * @see #isSetAccumulator()
     * @see #unsetAccumulator()
     * @see #setAccumulator(Accumulator)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorValue_Accumulator()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Accumulator#getAccumulatorValues
     * @model opposite="AccumulatorValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccumulatorValue.Accumulator' kind='element'"
     * @generated
     */
    Accumulator getAccumulator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulator</em>' reference.
     * @see #isSetAccumulator()
     * @see #unsetAccumulator()
     * @see #getAccumulator()
     * @generated
     */
    void setAccumulator( Accumulator value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulator()
     * @see #getAccumulator()
     * @see #setAccumulator(Accumulator)
     * @generated
     */
    void unsetAccumulator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulator <em>Accumulator</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulator</em>' reference is set.
     * @see #unsetAccumulator()
     * @see #getAccumulator()
     * @see #setAccumulator(Accumulator)
     * @generated
     */
    boolean isSetAccumulator();

    /**
     * Returns the value of the '<em><b>Accumulator Reset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorReset#getAccumulatorValue <em>Accumulator Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accumulator Reset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accumulator Reset</em>' reference.
     * @see #isSetAccumulatorReset()
     * @see #unsetAccumulatorReset()
     * @see #setAccumulatorReset(AccumulatorReset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorValue_AccumulatorReset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorReset#getAccumulatorValue
     * @model opposite="AccumulatorValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccumulatorValue.AccumulatorReset' kind='element'"
     * @generated
     */
    AccumulatorReset getAccumulatorReset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulator Reset</em>' reference.
     * @see #isSetAccumulatorReset()
     * @see #unsetAccumulatorReset()
     * @see #getAccumulatorReset()
     * @generated
     */
    void setAccumulatorReset( AccumulatorReset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccumulatorReset()
     * @see #getAccumulatorReset()
     * @see #setAccumulatorReset(AccumulatorReset)
     * @generated
     */
    void unsetAccumulatorReset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue#getAccumulatorReset <em>Accumulator Reset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accumulator Reset</em>' reference is set.
     * @see #unsetAccumulatorReset()
     * @see #getAccumulatorReset()
     * @see #setAccumulatorReset(AccumulatorReset)
     * @generated
     */
    boolean isSetAccumulatorReset();

} // AccumulatorValue
