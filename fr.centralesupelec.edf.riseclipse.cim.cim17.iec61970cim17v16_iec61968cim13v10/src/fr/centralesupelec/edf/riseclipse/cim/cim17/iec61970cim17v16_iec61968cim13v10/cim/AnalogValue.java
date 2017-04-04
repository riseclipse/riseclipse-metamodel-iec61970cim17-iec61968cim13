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
 * A representation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalog <em>Analog</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalogValue()
 * @model
 * @generated
 */
public interface AnalogValue extends MeasurementValue {
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
     * @see #setValue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalogValue_Value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalogValue.value' kind='element'"
     * @generated
     */
    Float getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Analog</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analog#getAnalogValues <em>Analog Values</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analog</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analog</em>' reference.
     * @see #isSetAnalog()
     * @see #unsetAnalog()
     * @see #setAnalog(Analog)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalogValue_Analog()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analog#getAnalogValues
     * @model opposite="AnalogValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalogValue.Analog' kind='element'"
     * @generated
     */
    Analog getAnalog();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalog <em>Analog</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analog</em>' reference.
     * @see #isSetAnalog()
     * @see #unsetAnalog()
     * @see #getAnalog()
     * @generated
     */
    void setAnalog( Analog value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalog <em>Analog</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalog()
     * @see #getAnalog()
     * @see #setAnalog(Analog)
     * @generated
     */
    void unsetAnalog();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalog <em>Analog</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog</em>' reference is set.
     * @see #unsetAnalog()
     * @see #getAnalog()
     * @see #setAnalog(Analog)
     * @generated
     */
    boolean isSetAnalog();

    /**
     * Returns the value of the '<em><b>Analog Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analog Control</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analog Control</em>' reference.
     * @see #isSetAnalogControl()
     * @see #unsetAnalogControl()
     * @see #setAnalogControl(AnalogControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalogValue_AnalogControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogControl#getAnalogValue
     * @model opposite="AnalogValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalogValue.AnalogControl' kind='element'"
     * @generated
     */
    AnalogControl getAnalogControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analog Control</em>' reference.
     * @see #isSetAnalogControl()
     * @see #unsetAnalogControl()
     * @see #getAnalogControl()
     * @generated
     */
    void setAnalogControl( AnalogControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogControl()
     * @see #getAnalogControl()
     * @see #setAnalogControl(AnalogControl)
     * @generated
     */
    void unsetAnalogControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog Control</em>' reference is set.
     * @see #unsetAnalogControl()
     * @see #getAnalogControl()
     * @see #setAnalogControl(AnalogControl)
     * @generated
     */
    boolean isSetAnalogControl();

    /**
     * Returns the value of the '<em><b>Alt Generating Unit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alt Generating Unit</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alt Generating Unit</em>' reference list.
     * @see #isSetAltGeneratingUnit()
     * @see #unsetAltGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalogValue_AltGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getAnalogValue
     * @model opposite="AnalogValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalogValue.AltGeneratingUnit' kind='element'"
     * @generated
     */
    EList< AltGeneratingUnitMeas > getAltGeneratingUnit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAltGeneratingUnit()
     * @see #getAltGeneratingUnit()
     * @generated
     */
    void unsetAltGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alt Generating Unit</em>' reference list is set.
     * @see #unsetAltGeneratingUnit()
     * @see #getAltGeneratingUnit()
     * @generated
     */
    boolean isSetAltGeneratingUnit();

    /**
     * Returns the value of the '<em><b>Alt Tie Meas</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltTieMeas}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltTieMeas#getAnalogValue <em>Analog Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alt Tie Meas</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alt Tie Meas</em>' reference list.
     * @see #isSetAltTieMeas()
     * @see #unsetAltTieMeas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalogValue_AltTieMeas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltTieMeas#getAnalogValue
     * @model opposite="AnalogValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalogValue.AltTieMeas' kind='element'"
     * @generated
     */
    EList< AltTieMeas > getAltTieMeas();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAltTieMeas()
     * @see #getAltTieMeas()
     * @generated
     */
    void unsetAltTieMeas();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alt Tie Meas</em>' reference list is set.
     * @see #unsetAltTieMeas()
     * @see #getAltTieMeas()
     * @generated
     */
    boolean isSetAltTieMeas();

} // AnalogValue
