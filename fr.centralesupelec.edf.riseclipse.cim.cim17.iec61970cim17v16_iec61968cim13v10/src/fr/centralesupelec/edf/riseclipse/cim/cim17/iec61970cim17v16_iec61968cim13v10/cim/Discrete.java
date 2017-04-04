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
 * A representation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscrete()
 * @model
 * @generated
 */
public interface Discrete extends Measurement {
    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #setMaxValue(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscrete_MaxValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Discrete.maxValue' kind='element'"
     * @generated
     */
    Integer getMaxValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(Integer)
     * @generated
     */
    void unsetMaxValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMaxValue <em>Max Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Value</em>' attribute is set.
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(Integer)
     * @generated
     */
    boolean isSetMaxValue();

    /**
     * Returns the value of the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #setMinValue(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscrete_MinValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Discrete.minValue' kind='element'"
     * @generated
     */
    Integer getMinValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @generated
     */
    void setMinValue( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(Integer)
     * @generated
     */
    void unsetMinValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getMinValue <em>Min Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Value</em>' attribute is set.
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(Integer)
     * @generated
     */
    boolean isSetMinValue();

    /**
     * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal Value</em>' attribute.
     * @see #isSetNormalValue()
     * @see #unsetNormalValue()
     * @see #setNormalValue(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscrete_NormalValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Discrete.normalValue' kind='element'"
     * @generated
     */
    Integer getNormalValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getNormalValue <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Value</em>' attribute.
     * @see #isSetNormalValue()
     * @see #unsetNormalValue()
     * @see #getNormalValue()
     * @generated
     */
    void setNormalValue( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getNormalValue <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalValue()
     * @see #getNormalValue()
     * @see #setNormalValue(Integer)
     * @generated
     */
    void unsetNormalValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getNormalValue <em>Normal Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Value</em>' attribute is set.
     * @see #unsetNormalValue()
     * @see #getNormalValue()
     * @see #setNormalValue(Integer)
     * @generated
     */
    boolean isSetNormalValue();

    /**
     * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueAliasSet#getDiscretes <em>Discretes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Alias Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Alias Set</em>' reference.
     * @see #isSetValueAliasSet()
     * @see #unsetValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscrete_ValueAliasSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueAliasSet#getDiscretes
     * @model opposite="Discretes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Discrete.ValueAliasSet' kind='element'"
     * @generated
     */
    ValueAliasSet getValueAliasSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Alias Set</em>' reference.
     * @see #isSetValueAliasSet()
     * @see #unsetValueAliasSet()
     * @see #getValueAliasSet()
     * @generated
     */
    void setValueAliasSet( ValueAliasSet value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    void unsetValueAliasSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value Alias Set</em>' reference is set.
     * @see #unsetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    boolean isSetValueAliasSet();

    /**
     * Returns the value of the '<em><b>Discrete Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getDiscrete <em>Discrete</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Discrete Values</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Discrete Values</em>' reference list.
     * @see #isSetDiscreteValues()
     * @see #unsetDiscreteValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscrete_DiscreteValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getDiscrete
     * @model opposite="Discrete" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Discrete.DiscreteValues' kind='element'"
     * @generated
     */
    EList< DiscreteValue > getDiscreteValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscreteValues()
     * @see #getDiscreteValues()
     * @generated
     */
    void unsetDiscreteValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discrete Values</em>' reference list is set.
     * @see #unsetDiscreteValues()
     * @see #getDiscreteValues()
     * @generated
     */
    boolean isSetDiscreteValues();

} // Discrete
