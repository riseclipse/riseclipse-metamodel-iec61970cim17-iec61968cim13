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
 * A representation of the model object '<em><b>Test Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestMethod <em>Test Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestVariant <em>Test Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardASTM <em>Test Standard ASTM</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardCIGRE <em>Test Standard CIGRE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDIN <em>Test Standard DIN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDoble <em>Test Standard Doble</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardEPA <em>Test Standard EPA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEC <em>Test Standard IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEEE <em>Test Standard IEEE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardISO <em>Test Standard ISO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardLaborelec <em>Test Standard Laborelec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardTAPPI <em>Test Standard TAPPI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardUKMinistryOfDefence <em>Test Standard UK Ministry Of Defence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardWEP <em>Test Standard WEP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetString <em>Asset String</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetDiscrete <em>Asset Discrete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetAnalog <em>Asset Analog</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard()
 * @model
 * @generated
 */
public interface TestStandard extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Test Method</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestMethod}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Method</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Method</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestMethod
     * @see #isSetTestMethod()
     * @see #unsetTestMethod()
     * @see #setTestMethod(TestMethod)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestMethod()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testMethod' kind='element'"
     * @generated
     */
    TestMethod getTestMethod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestMethod <em>Test Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Method</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestMethod
     * @see #isSetTestMethod()
     * @see #unsetTestMethod()
     * @see #getTestMethod()
     * @generated
     */
    void setTestMethod( TestMethod value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestMethod <em>Test Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestMethod()
     * @see #getTestMethod()
     * @see #setTestMethod(TestMethod)
     * @generated
     */
    void unsetTestMethod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestMethod <em>Test Method</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Method</em>' attribute is set.
     * @see #unsetTestMethod()
     * @see #getTestMethod()
     * @see #setTestMethod(TestMethod)
     * @generated
     */
    boolean isSetTestMethod();

    /**
     * Returns the value of the '<em><b>Test Variant</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestVariantKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Variant</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Variant</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestVariantKind
     * @see #isSetTestVariant()
     * @see #unsetTestVariant()
     * @see #setTestVariant(TestVariantKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestVariant()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testVariant' kind='element'"
     * @generated
     */
    TestVariantKind getTestVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestVariant <em>Test Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Variant</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestVariantKind
     * @see #isSetTestVariant()
     * @see #unsetTestVariant()
     * @see #getTestVariant()
     * @generated
     */
    void setTestVariant( TestVariantKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestVariant <em>Test Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestVariant()
     * @see #getTestVariant()
     * @see #setTestVariant(TestVariantKind)
     * @generated
     */
    void unsetTestVariant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestVariant <em>Test Variant</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Variant</em>' attribute is set.
     * @see #unsetTestVariant()
     * @see #getTestVariant()
     * @see #setTestVariant(TestVariantKind)
     * @generated
     */
    boolean isSetTestVariant();

    /**
     * Returns the value of the '<em><b>Test Standard ASTM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard ASTM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard ASTM</em>' containment reference.
     * @see #isSetTestStandardASTM()
     * @see #unsetTestStandardASTM()
     * @see #setTestStandardASTM(ASTMStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardASTM()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardASTM' kind='element'"
     * @generated
     */
    ASTMStandard getTestStandardASTM();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardASTM <em>Test Standard ASTM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard ASTM</em>' containment reference.
     * @see #isSetTestStandardASTM()
     * @see #unsetTestStandardASTM()
     * @see #getTestStandardASTM()
     * @generated
     */
    void setTestStandardASTM( ASTMStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardASTM <em>Test Standard ASTM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardASTM()
     * @see #getTestStandardASTM()
     * @see #setTestStandardASTM(ASTMStandard)
     * @generated
     */
    void unsetTestStandardASTM();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardASTM <em>Test Standard ASTM</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard ASTM</em>' containment reference is set.
     * @see #unsetTestStandardASTM()
     * @see #getTestStandardASTM()
     * @see #setTestStandardASTM(ASTMStandard)
     * @generated
     */
    boolean isSetTestStandardASTM();

    /**
     * Returns the value of the '<em><b>Test Standard CIGRE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard CIGRE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard CIGRE</em>' containment reference.
     * @see #isSetTestStandardCIGRE()
     * @see #unsetTestStandardCIGRE()
     * @see #setTestStandardCIGRE(CIGREStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardCIGRE()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardCIGRE' kind='element'"
     * @generated
     */
    CIGREStandard getTestStandardCIGRE();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardCIGRE <em>Test Standard CIGRE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard CIGRE</em>' containment reference.
     * @see #isSetTestStandardCIGRE()
     * @see #unsetTestStandardCIGRE()
     * @see #getTestStandardCIGRE()
     * @generated
     */
    void setTestStandardCIGRE( CIGREStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardCIGRE <em>Test Standard CIGRE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardCIGRE()
     * @see #getTestStandardCIGRE()
     * @see #setTestStandardCIGRE(CIGREStandard)
     * @generated
     */
    void unsetTestStandardCIGRE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardCIGRE <em>Test Standard CIGRE</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard CIGRE</em>' containment reference is set.
     * @see #unsetTestStandardCIGRE()
     * @see #getTestStandardCIGRE()
     * @see #setTestStandardCIGRE(CIGREStandard)
     * @generated
     */
    boolean isSetTestStandardCIGRE();

    /**
     * Returns the value of the '<em><b>Test Standard DIN</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard DIN</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard DIN</em>' containment reference.
     * @see #isSetTestStandardDIN()
     * @see #unsetTestStandardDIN()
     * @see #setTestStandardDIN(DINStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardDIN()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardDIN' kind='element'"
     * @generated
     */
    DINStandard getTestStandardDIN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDIN <em>Test Standard DIN</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard DIN</em>' containment reference.
     * @see #isSetTestStandardDIN()
     * @see #unsetTestStandardDIN()
     * @see #getTestStandardDIN()
     * @generated
     */
    void setTestStandardDIN( DINStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDIN <em>Test Standard DIN</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardDIN()
     * @see #getTestStandardDIN()
     * @see #setTestStandardDIN(DINStandard)
     * @generated
     */
    void unsetTestStandardDIN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDIN <em>Test Standard DIN</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard DIN</em>' containment reference is set.
     * @see #unsetTestStandardDIN()
     * @see #getTestStandardDIN()
     * @see #setTestStandardDIN(DINStandard)
     * @generated
     */
    boolean isSetTestStandardDIN();

    /**
     * Returns the value of the '<em><b>Test Standard Doble</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard Doble</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard Doble</em>' containment reference.
     * @see #isSetTestStandardDoble()
     * @see #unsetTestStandardDoble()
     * @see #setTestStandardDoble(DobleStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardDoble()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardDoble' kind='element'"
     * @generated
     */
    DobleStandard getTestStandardDoble();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDoble <em>Test Standard Doble</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard Doble</em>' containment reference.
     * @see #isSetTestStandardDoble()
     * @see #unsetTestStandardDoble()
     * @see #getTestStandardDoble()
     * @generated
     */
    void setTestStandardDoble( DobleStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDoble <em>Test Standard Doble</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardDoble()
     * @see #getTestStandardDoble()
     * @see #setTestStandardDoble(DobleStandard)
     * @generated
     */
    void unsetTestStandardDoble();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardDoble <em>Test Standard Doble</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard Doble</em>' containment reference is set.
     * @see #unsetTestStandardDoble()
     * @see #getTestStandardDoble()
     * @see #setTestStandardDoble(DobleStandard)
     * @generated
     */
    boolean isSetTestStandardDoble();

    /**
     * Returns the value of the '<em><b>Test Standard EPA</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard EPA</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard EPA</em>' containment reference.
     * @see #isSetTestStandardEPA()
     * @see #unsetTestStandardEPA()
     * @see #setTestStandardEPA(EPAStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardEPA()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardEPA' kind='element'"
     * @generated
     */
    EPAStandard getTestStandardEPA();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardEPA <em>Test Standard EPA</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard EPA</em>' containment reference.
     * @see #isSetTestStandardEPA()
     * @see #unsetTestStandardEPA()
     * @see #getTestStandardEPA()
     * @generated
     */
    void setTestStandardEPA( EPAStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardEPA <em>Test Standard EPA</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardEPA()
     * @see #getTestStandardEPA()
     * @see #setTestStandardEPA(EPAStandard)
     * @generated
     */
    void unsetTestStandardEPA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardEPA <em>Test Standard EPA</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard EPA</em>' containment reference is set.
     * @see #unsetTestStandardEPA()
     * @see #getTestStandardEPA()
     * @see #setTestStandardEPA(EPAStandard)
     * @generated
     */
    boolean isSetTestStandardEPA();

    /**
     * Returns the value of the '<em><b>Test Standard IEC</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard IEC</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard IEC</em>' containment reference.
     * @see #isSetTestStandardIEC()
     * @see #unsetTestStandardIEC()
     * @see #setTestStandardIEC(IECStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardIEC()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardIEC' kind='element'"
     * @generated
     */
    IECStandard getTestStandardIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEC <em>Test Standard IEC</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard IEC</em>' containment reference.
     * @see #isSetTestStandardIEC()
     * @see #unsetTestStandardIEC()
     * @see #getTestStandardIEC()
     * @generated
     */
    void setTestStandardIEC( IECStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEC <em>Test Standard IEC</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardIEC()
     * @see #getTestStandardIEC()
     * @see #setTestStandardIEC(IECStandard)
     * @generated
     */
    void unsetTestStandardIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEC <em>Test Standard IEC</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard IEC</em>' containment reference is set.
     * @see #unsetTestStandardIEC()
     * @see #getTestStandardIEC()
     * @see #setTestStandardIEC(IECStandard)
     * @generated
     */
    boolean isSetTestStandardIEC();

    /**
     * Returns the value of the '<em><b>Test Standard IEEE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard IEEE</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard IEEE</em>' containment reference.
     * @see #isSetTestStandardIEEE()
     * @see #unsetTestStandardIEEE()
     * @see #setTestStandardIEEE(IEEEStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardIEEE()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardIEEE' kind='element'"
     * @generated
     */
    IEEEStandard getTestStandardIEEE();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEEE <em>Test Standard IEEE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard IEEE</em>' containment reference.
     * @see #isSetTestStandardIEEE()
     * @see #unsetTestStandardIEEE()
     * @see #getTestStandardIEEE()
     * @generated
     */
    void setTestStandardIEEE( IEEEStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEEE <em>Test Standard IEEE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardIEEE()
     * @see #getTestStandardIEEE()
     * @see #setTestStandardIEEE(IEEEStandard)
     * @generated
     */
    void unsetTestStandardIEEE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardIEEE <em>Test Standard IEEE</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard IEEE</em>' containment reference is set.
     * @see #unsetTestStandardIEEE()
     * @see #getTestStandardIEEE()
     * @see #setTestStandardIEEE(IEEEStandard)
     * @generated
     */
    boolean isSetTestStandardIEEE();

    /**
     * Returns the value of the '<em><b>Test Standard ISO</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard ISO</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard ISO</em>' containment reference.
     * @see #isSetTestStandardISO()
     * @see #unsetTestStandardISO()
     * @see #setTestStandardISO(ISOStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardISO()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardISO' kind='element'"
     * @generated
     */
    ISOStandard getTestStandardISO();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardISO <em>Test Standard ISO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard ISO</em>' containment reference.
     * @see #isSetTestStandardISO()
     * @see #unsetTestStandardISO()
     * @see #getTestStandardISO()
     * @generated
     */
    void setTestStandardISO( ISOStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardISO <em>Test Standard ISO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardISO()
     * @see #getTestStandardISO()
     * @see #setTestStandardISO(ISOStandard)
     * @generated
     */
    void unsetTestStandardISO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardISO <em>Test Standard ISO</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard ISO</em>' containment reference is set.
     * @see #unsetTestStandardISO()
     * @see #getTestStandardISO()
     * @see #setTestStandardISO(ISOStandard)
     * @generated
     */
    boolean isSetTestStandardISO();

    /**
     * Returns the value of the '<em><b>Test Standard Laborelec</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard Laborelec</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard Laborelec</em>' containment reference.
     * @see #isSetTestStandardLaborelec()
     * @see #unsetTestStandardLaborelec()
     * @see #setTestStandardLaborelec(LaborelecStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardLaborelec()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardLaborelec' kind='element'"
     * @generated
     */
    LaborelecStandard getTestStandardLaborelec();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardLaborelec <em>Test Standard Laborelec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard Laborelec</em>' containment reference.
     * @see #isSetTestStandardLaborelec()
     * @see #unsetTestStandardLaborelec()
     * @see #getTestStandardLaborelec()
     * @generated
     */
    void setTestStandardLaborelec( LaborelecStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardLaborelec <em>Test Standard Laborelec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardLaborelec()
     * @see #getTestStandardLaborelec()
     * @see #setTestStandardLaborelec(LaborelecStandard)
     * @generated
     */
    void unsetTestStandardLaborelec();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardLaborelec <em>Test Standard Laborelec</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard Laborelec</em>' containment reference is set.
     * @see #unsetTestStandardLaborelec()
     * @see #getTestStandardLaborelec()
     * @see #setTestStandardLaborelec(LaborelecStandard)
     * @generated
     */
    boolean isSetTestStandardLaborelec();

    /**
     * Returns the value of the '<em><b>Test Standard TAPPI</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard TAPPI</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard TAPPI</em>' containment reference.
     * @see #isSetTestStandardTAPPI()
     * @see #unsetTestStandardTAPPI()
     * @see #setTestStandardTAPPI(TAPPIStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardTAPPI()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardTAPPI' kind='element'"
     * @generated
     */
    TAPPIStandard getTestStandardTAPPI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardTAPPI <em>Test Standard TAPPI</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard TAPPI</em>' containment reference.
     * @see #isSetTestStandardTAPPI()
     * @see #unsetTestStandardTAPPI()
     * @see #getTestStandardTAPPI()
     * @generated
     */
    void setTestStandardTAPPI( TAPPIStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardTAPPI <em>Test Standard TAPPI</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardTAPPI()
     * @see #getTestStandardTAPPI()
     * @see #setTestStandardTAPPI(TAPPIStandard)
     * @generated
     */
    void unsetTestStandardTAPPI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardTAPPI <em>Test Standard TAPPI</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard TAPPI</em>' containment reference is set.
     * @see #unsetTestStandardTAPPI()
     * @see #getTestStandardTAPPI()
     * @see #setTestStandardTAPPI(TAPPIStandard)
     * @generated
     */
    boolean isSetTestStandardTAPPI();

    /**
     * Returns the value of the '<em><b>Test Standard UK Ministry Of Defence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard UK Ministry Of Defence</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard UK Ministry Of Defence</em>' containment reference.
     * @see #isSetTestStandardUKMinistryOfDefence()
     * @see #unsetTestStandardUKMinistryOfDefence()
     * @see #setTestStandardUKMinistryOfDefence(UKMinistryOfDefenceStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardUKMinistryOfDefence()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardUKMinistryOfDefence' kind='element'"
     * @generated
     */
    UKMinistryOfDefenceStandard getTestStandardUKMinistryOfDefence();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardUKMinistryOfDefence <em>Test Standard UK Ministry Of Defence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard UK Ministry Of Defence</em>' containment reference.
     * @see #isSetTestStandardUKMinistryOfDefence()
     * @see #unsetTestStandardUKMinistryOfDefence()
     * @see #getTestStandardUKMinistryOfDefence()
     * @generated
     */
    void setTestStandardUKMinistryOfDefence( UKMinistryOfDefenceStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardUKMinistryOfDefence <em>Test Standard UK Ministry Of Defence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardUKMinistryOfDefence()
     * @see #getTestStandardUKMinistryOfDefence()
     * @see #setTestStandardUKMinistryOfDefence(UKMinistryOfDefenceStandard)
     * @generated
     */
    void unsetTestStandardUKMinistryOfDefence();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardUKMinistryOfDefence <em>Test Standard UK Ministry Of Defence</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard UK Ministry Of Defence</em>' containment reference is set.
     * @see #unsetTestStandardUKMinistryOfDefence()
     * @see #getTestStandardUKMinistryOfDefence()
     * @see #setTestStandardUKMinistryOfDefence(UKMinistryOfDefenceStandard)
     * @generated
     */
    boolean isSetTestStandardUKMinistryOfDefence();

    /**
     * Returns the value of the '<em><b>Test Standard WEP</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard WEP</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard WEP</em>' containment reference.
     * @see #isSetTestStandardWEP()
     * @see #unsetTestStandardWEP()
     * @see #setTestStandardWEP(WEPStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_TestStandardWEP()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.testStandardWEP' kind='element'"
     * @generated
     */
    WEPStandard getTestStandardWEP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardWEP <em>Test Standard WEP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard WEP</em>' containment reference.
     * @see #isSetTestStandardWEP()
     * @see #unsetTestStandardWEP()
     * @see #getTestStandardWEP()
     * @generated
     */
    void setTestStandardWEP( WEPStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardWEP <em>Test Standard WEP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandardWEP()
     * @see #getTestStandardWEP()
     * @see #setTestStandardWEP(WEPStandard)
     * @generated
     */
    void unsetTestStandardWEP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getTestStandardWEP <em>Test Standard WEP</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard WEP</em>' containment reference is set.
     * @see #unsetTestStandardWEP()
     * @see #getTestStandardWEP()
     * @see #setTestStandardWEP(WEPStandard)
     * @generated
     */
    boolean isSetTestStandardWEP();

    /**
     * Returns the value of the '<em><b>Asset String</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetStringMeasurement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetStringMeasurement#getTestStandard <em>Test Standard</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset String</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset String</em>' reference list.
     * @see #isSetAssetString()
     * @see #unsetAssetString()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_AssetString()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetStringMeasurement#getTestStandard
     * @model opposite="TestStandard" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.AssetString' kind='element'"
     * @generated
     */
    EList< AssetStringMeasurement > getAssetString();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetString <em>Asset String</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetString()
     * @see #getAssetString()
     * @generated
     */
    void unsetAssetString();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetString <em>Asset String</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset String</em>' reference list is set.
     * @see #unsetAssetString()
     * @see #getAssetString()
     * @generated
     */
    boolean isSetAssetString();

    /**
     * Returns the value of the '<em><b>Asset Discrete</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete#getTestStandard <em>Test Standard</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Discrete</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Discrete</em>' reference list.
     * @see #isSetAssetDiscrete()
     * @see #unsetAssetDiscrete()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_AssetDiscrete()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete#getTestStandard
     * @model opposite="TestStandard" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.AssetDiscrete' kind='element'"
     * @generated
     */
    EList< AssetDiscrete > getAssetDiscrete();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetDiscrete <em>Asset Discrete</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetDiscrete()
     * @see #getAssetDiscrete()
     * @generated
     */
    void unsetAssetDiscrete();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetDiscrete <em>Asset Discrete</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Discrete</em>' reference list is set.
     * @see #unsetAssetDiscrete()
     * @see #getAssetDiscrete()
     * @generated
     */
    boolean isSetAssetDiscrete();

    /**
     * Returns the value of the '<em><b>Asset Analog</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getTestStandard <em>Test Standard</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Analog</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Analog</em>' reference list.
     * @see #isSetAssetAnalog()
     * @see #unsetAssetAnalog()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestStandard_AssetAnalog()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getTestStandard
     * @model opposite="TestStandard" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestStandard.AssetAnalog' kind='element'"
     * @generated
     */
    EList< AssetAnalog > getAssetAnalog();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetAnalog <em>Asset Analog</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetAnalog()
     * @see #getAssetAnalog()
     * @generated
     */
    void unsetAssetAnalog();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetAnalog <em>Asset Analog</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Analog</em>' reference list is set.
     * @see #unsetAssetAnalog()
     * @see #getAssetAnalog()
     * @generated
     */
    boolean isSetAssetAnalog();

} // TestStandard
