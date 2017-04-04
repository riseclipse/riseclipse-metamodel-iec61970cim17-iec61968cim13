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
 * A representation of the model object '<em><b>Asset Discrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete#getTestStandard <em>Test Standard</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetDiscrete()
 * @model
 * @generated
 */
public interface AssetDiscrete extends Discrete {
    /**
     * Returns the value of the '<em><b>Test Standard</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetDiscrete <em>Asset Discrete</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard</em>' reference.
     * @see #isSetTestStandard()
     * @see #unsetTestStandard()
     * @see #setTestStandard(TestStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetDiscrete_TestStandard()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetDiscrete
     * @model opposite="AssetDiscrete" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetDiscrete.TestStandard' kind='element'"
     * @generated
     */
    TestStandard getTestStandard();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete#getTestStandard <em>Test Standard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard</em>' reference.
     * @see #isSetTestStandard()
     * @see #unsetTestStandard()
     * @see #getTestStandard()
     * @generated
     */
    void setTestStandard( TestStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete#getTestStandard <em>Test Standard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandard()
     * @see #getTestStandard()
     * @see #setTestStandard(TestStandard)
     * @generated
     */
    void unsetTestStandard();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete#getTestStandard <em>Test Standard</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard</em>' reference is set.
     * @see #unsetTestStandard()
     * @see #getTestStandard()
     * @see #setTestStandard(TestStandard)
     * @generated
     */
    boolean isSetTestStandard();

} // AssetDiscrete
