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
 * A representation of the model object '<em><b>Transformer Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getBasePower <em>Base Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerTest()
 * @model
 * @generated
 */
public interface TransformerTest extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Base Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Power</em>' attribute.
     * @see #isSetBasePower()
     * @see #unsetBasePower()
     * @see #setBasePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerTest_BasePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerTest.basePower' kind='element'"
     * @generated
     */
    Float getBasePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getBasePower <em>Base Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Power</em>' attribute.
     * @see #isSetBasePower()
     * @see #unsetBasePower()
     * @see #getBasePower()
     * @generated
     */
    void setBasePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getBasePower <em>Base Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBasePower()
     * @see #getBasePower()
     * @see #setBasePower(Float)
     * @generated
     */
    void unsetBasePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getBasePower <em>Base Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Power</em>' attribute is set.
     * @see #unsetBasePower()
     * @see #getBasePower()
     * @see #setBasePower(Float)
     * @generated
     */
    boolean isSetBasePower();

    /**
     * Returns the value of the '<em><b>Temperature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Temperature</em>' attribute.
     * @see #isSetTemperature()
     * @see #unsetTemperature()
     * @see #setTemperature(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerTest_Temperature()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerTest.temperature' kind='element'"
     * @generated
     */
    Float getTemperature();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getTemperature <em>Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Temperature</em>' attribute.
     * @see #isSetTemperature()
     * @see #unsetTemperature()
     * @see #getTemperature()
     * @generated
     */
    void setTemperature( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getTemperature <em>Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTemperature()
     * @see #getTemperature()
     * @see #setTemperature(Float)
     * @generated
     */
    void unsetTemperature();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest#getTemperature <em>Temperature</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Temperature</em>' attribute is set.
     * @see #unsetTemperature()
     * @see #getTemperature()
     * @see #setTemperature(Float)
     * @generated
     */
    boolean isSetTemperature();

} // TransformerTest
