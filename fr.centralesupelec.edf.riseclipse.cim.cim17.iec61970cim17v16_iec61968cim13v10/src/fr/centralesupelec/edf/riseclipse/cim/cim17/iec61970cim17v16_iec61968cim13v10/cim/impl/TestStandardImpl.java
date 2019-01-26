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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetStringMeasurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CIGREStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DINStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IECStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LaborelecStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TAPPIStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestMethod;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestVariantKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UKMinistryOfDefenceStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WEPStandard;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestMethod <em>Test Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestVariant <em>Test Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardASTM <em>Test Standard ASTM</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardCIGRE <em>Test Standard CIGRE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardDIN <em>Test Standard DIN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardDoble <em>Test Standard Doble</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardEPA <em>Test Standard EPA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardIEC <em>Test Standard IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardIEEE <em>Test Standard IEEE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardISO <em>Test Standard ISO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardLaborelec <em>Test Standard Laborelec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardTAPPI <em>Test Standard TAPPI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardUKMinistryOfDefence <em>Test Standard UK Ministry Of Defence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getTestStandardWEP <em>Test Standard WEP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getAssetString <em>Asset String</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getAssetDiscrete <em>Asset Discrete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestStandardImpl#getAssetAnalog <em>Asset Analog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestStandardImpl extends IdentifiedObjectImpl implements TestStandard {
    /**
     * The default value of the '{@link #getTestMethod() <em>Test Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestMethod()
     * @generated
     * @ordered
     */
    protected static final TestMethod TEST_METHOD_EDEFAULT = TestMethod.D1275A;

    /**
     * The cached value of the '{@link #getTestMethod() <em>Test Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestMethod()
     * @generated
     * @ordered
     */
    protected TestMethod testMethod = TEST_METHOD_EDEFAULT;

    /**
     * This is true if the Test Method attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testMethodESet;

    /**
     * The default value of the '{@link #getTestVariant() <em>Test Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestVariant()
     * @generated
     * @ordered
     */
    protected static final TestVariantKind TEST_VARIANT_EDEFAULT = TestVariantKind.MINUS40_C;

    /**
     * The cached value of the '{@link #getTestVariant() <em>Test Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestVariant()
     * @generated
     * @ordered
     */
    protected TestVariantKind testVariant = TEST_VARIANT_EDEFAULT;

    /**
     * This is true if the Test Variant attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testVariantESet;

    /**
     * The cached value of the '{@link #getTestStandardASTM() <em>Test Standard ASTM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardASTM()
     * @generated
     * @ordered
     */
    protected ASTMStandard testStandardASTM;

    /**
     * This is true if the Test Standard ASTM containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardASTMESet;

    /**
     * The cached value of the '{@link #getTestStandardCIGRE() <em>Test Standard CIGRE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardCIGRE()
     * @generated
     * @ordered
     */
    protected CIGREStandard testStandardCIGRE;

    /**
     * This is true if the Test Standard CIGRE containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardCIGREESet;

    /**
     * The cached value of the '{@link #getTestStandardDIN() <em>Test Standard DIN</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardDIN()
     * @generated
     * @ordered
     */
    protected DINStandard testStandardDIN;

    /**
     * This is true if the Test Standard DIN containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardDINESet;

    /**
     * The cached value of the '{@link #getTestStandardDoble() <em>Test Standard Doble</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardDoble()
     * @generated
     * @ordered
     */
    protected DobleStandard testStandardDoble;

    /**
     * This is true if the Test Standard Doble containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardDobleESet;

    /**
     * The cached value of the '{@link #getTestStandardEPA() <em>Test Standard EPA</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardEPA()
     * @generated
     * @ordered
     */
    protected EPAStandard testStandardEPA;

    /**
     * This is true if the Test Standard EPA containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardEPAESet;

    /**
     * The cached value of the '{@link #getTestStandardIEC() <em>Test Standard IEC</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardIEC()
     * @generated
     * @ordered
     */
    protected IECStandard testStandardIEC;

    /**
     * This is true if the Test Standard IEC containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardIECESet;

    /**
     * The cached value of the '{@link #getTestStandardIEEE() <em>Test Standard IEEE</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardIEEE()
     * @generated
     * @ordered
     */
    protected IEEEStandard testStandardIEEE;

    /**
     * This is true if the Test Standard IEEE containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardIEEEESet;

    /**
     * The cached value of the '{@link #getTestStandardISO() <em>Test Standard ISO</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardISO()
     * @generated
     * @ordered
     */
    protected ISOStandard testStandardISO;

    /**
     * This is true if the Test Standard ISO containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardISOESet;

    /**
     * The cached value of the '{@link #getTestStandardLaborelec() <em>Test Standard Laborelec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardLaborelec()
     * @generated
     * @ordered
     */
    protected LaborelecStandard testStandardLaborelec;

    /**
     * This is true if the Test Standard Laborelec containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardLaborelecESet;

    /**
     * The cached value of the '{@link #getTestStandardTAPPI() <em>Test Standard TAPPI</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardTAPPI()
     * @generated
     * @ordered
     */
    protected TAPPIStandard testStandardTAPPI;

    /**
     * This is true if the Test Standard TAPPI containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardTAPPIESet;

    /**
     * The cached value of the '{@link #getTestStandardUKMinistryOfDefence() <em>Test Standard UK Ministry Of Defence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardUKMinistryOfDefence()
     * @generated
     * @ordered
     */
    protected UKMinistryOfDefenceStandard testStandardUKMinistryOfDefence;

    /**
     * This is true if the Test Standard UK Ministry Of Defence containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardUKMinistryOfDefenceESet;

    /**
     * The cached value of the '{@link #getTestStandardWEP() <em>Test Standard WEP</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandardWEP()
     * @generated
     * @ordered
     */
    protected WEPStandard testStandardWEP;

    /**
     * This is true if the Test Standard WEP containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardWEPESet;

    /**
     * The cached value of the '{@link #getAssetString() <em>Asset String</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetString()
     * @generated
     * @ordered
     */
    protected EList< AssetStringMeasurement > assetString;

    /**
     * The cached value of the '{@link #getAssetDiscrete() <em>Asset Discrete</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetDiscrete()
     * @generated
     * @ordered
     */
    protected EList< AssetDiscrete > assetDiscrete;

    /**
     * The cached value of the '{@link #getAssetAnalog() <em>Asset Analog</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetAnalog()
     * @generated
     * @ordered
     */
    protected EList< AssetAnalog > assetAnalog;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestStandardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTestStandard();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TestMethod getTestMethod() {
        return testMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestMethod( TestMethod newTestMethod ) {
        TestMethod oldTestMethod = testMethod;
        testMethod = newTestMethod == null ? TEST_METHOD_EDEFAULT : newTestMethod;
        boolean oldTestMethodESet = testMethodESet;
        testMethodESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TEST_STANDARD__TEST_METHOD, oldTestMethod, testMethod, !oldTestMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestMethod() {
        TestMethod oldTestMethod = testMethod;
        boolean oldTestMethodESet = testMethodESet;
        testMethod = TEST_METHOD_EDEFAULT;
        testMethodESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TEST_STANDARD__TEST_METHOD, oldTestMethod, TEST_METHOD_EDEFAULT, oldTestMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestMethod() {
        return testMethodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TestVariantKind getTestVariant() {
        return testVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestVariant( TestVariantKind newTestVariant ) {
        TestVariantKind oldTestVariant = testVariant;
        testVariant = newTestVariant == null ? TEST_VARIANT_EDEFAULT : newTestVariant;
        boolean oldTestVariantESet = testVariantESet;
        testVariantESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TEST_STANDARD__TEST_VARIANT, oldTestVariant, testVariant, !oldTestVariantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestVariant() {
        TestVariantKind oldTestVariant = testVariant;
        boolean oldTestVariantESet = testVariantESet;
        testVariant = TEST_VARIANT_EDEFAULT;
        testVariantESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TEST_STANDARD__TEST_VARIANT, oldTestVariant, TEST_VARIANT_EDEFAULT, oldTestVariantESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestVariant() {
        return testVariantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ASTMStandard getTestStandardASTM() {
        return testStandardASTM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardASTM( ASTMStandard newTestStandardASTM, NotificationChain msgs ) {
        ASTMStandard oldTestStandardASTM = testStandardASTM;
        testStandardASTM = newTestStandardASTM;
        boolean oldTestStandardASTMESet = testStandardASTMESet;
        testStandardASTMESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM, oldTestStandardASTM, newTestStandardASTM,
                    !oldTestStandardASTMESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardASTM( ASTMStandard newTestStandardASTM ) {
        if( newTestStandardASTM != testStandardASTM ) {
            NotificationChain msgs = null;
            if( testStandardASTM != null ) msgs = ( ( InternalEObject ) testStandardASTM ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM, null, msgs );
            if( newTestStandardASTM != null ) msgs = ( ( InternalEObject ) newTestStandardASTM ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM, null, msgs );
            msgs = basicSetTestStandardASTM( newTestStandardASTM, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardASTMESet = testStandardASTMESet;
            testStandardASTMESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM,
                        newTestStandardASTM, newTestStandardASTM, !oldTestStandardASTMESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardASTM( NotificationChain msgs ) {
        ASTMStandard oldTestStandardASTM = testStandardASTM;
        testStandardASTM = null;
        boolean oldTestStandardASTMESet = testStandardASTMESet;
        testStandardASTMESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM, oldTestStandardASTM, null, oldTestStandardASTMESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardASTM() {
        if( testStandardASTM != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardASTM ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM, null, msgs );
            msgs = basicUnsetTestStandardASTM( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardASTMESet = testStandardASTMESet;
            testStandardASTMESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM, null, null, oldTestStandardASTMESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardASTM() {
        return testStandardASTMESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CIGREStandard getTestStandardCIGRE() {
        return testStandardCIGRE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardCIGRE( CIGREStandard newTestStandardCIGRE, NotificationChain msgs ) {
        CIGREStandard oldTestStandardCIGRE = testStandardCIGRE;
        testStandardCIGRE = newTestStandardCIGRE;
        boolean oldTestStandardCIGREESet = testStandardCIGREESet;
        testStandardCIGREESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE, oldTestStandardCIGRE, newTestStandardCIGRE,
                    !oldTestStandardCIGREESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardCIGRE( CIGREStandard newTestStandardCIGRE ) {
        if( newTestStandardCIGRE != testStandardCIGRE ) {
            NotificationChain msgs = null;
            if( testStandardCIGRE != null ) msgs = ( ( InternalEObject ) testStandardCIGRE ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE, null, msgs );
            if( newTestStandardCIGRE != null ) msgs = ( ( InternalEObject ) newTestStandardCIGRE ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE, null, msgs );
            msgs = basicSetTestStandardCIGRE( newTestStandardCIGRE, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardCIGREESet = testStandardCIGREESet;
            testStandardCIGREESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE,
                        newTestStandardCIGRE, newTestStandardCIGRE, !oldTestStandardCIGREESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardCIGRE( NotificationChain msgs ) {
        CIGREStandard oldTestStandardCIGRE = testStandardCIGRE;
        testStandardCIGRE = null;
        boolean oldTestStandardCIGREESet = testStandardCIGREESet;
        testStandardCIGREESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE, oldTestStandardCIGRE, null,
                    oldTestStandardCIGREESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardCIGRE() {
        if( testStandardCIGRE != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardCIGRE ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE, null, msgs );
            msgs = basicUnsetTestStandardCIGRE( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardCIGREESet = testStandardCIGREESet;
            testStandardCIGREESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE, null, null, oldTestStandardCIGREESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardCIGRE() {
        return testStandardCIGREESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DINStandard getTestStandardDIN() {
        return testStandardDIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardDIN( DINStandard newTestStandardDIN, NotificationChain msgs ) {
        DINStandard oldTestStandardDIN = testStandardDIN;
        testStandardDIN = newTestStandardDIN;
        boolean oldTestStandardDINESet = testStandardDINESet;
        testStandardDINESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_DIN, oldTestStandardDIN, newTestStandardDIN,
                    !oldTestStandardDINESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardDIN( DINStandard newTestStandardDIN ) {
        if( newTestStandardDIN != testStandardDIN ) {
            NotificationChain msgs = null;
            if( testStandardDIN != null ) msgs = ( ( InternalEObject ) testStandardDIN ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_DIN, null, msgs );
            if( newTestStandardDIN != null ) msgs = ( ( InternalEObject ) newTestStandardDIN ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_DIN, null, msgs );
            msgs = basicSetTestStandardDIN( newTestStandardDIN, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardDINESet = testStandardDINESet;
            testStandardDINESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_DIN,
                        newTestStandardDIN, newTestStandardDIN, !oldTestStandardDINESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardDIN( NotificationChain msgs ) {
        DINStandard oldTestStandardDIN = testStandardDIN;
        testStandardDIN = null;
        boolean oldTestStandardDINESet = testStandardDINESet;
        testStandardDINESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_DIN, oldTestStandardDIN, null, oldTestStandardDINESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardDIN() {
        if( testStandardDIN != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardDIN ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_DIN, null, msgs );
            msgs = basicUnsetTestStandardDIN( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardDINESet = testStandardDINESet;
            testStandardDINESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_DIN, null, null, oldTestStandardDINESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardDIN() {
        return testStandardDINESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DobleStandard getTestStandardDoble() {
        return testStandardDoble;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardDoble( DobleStandard newTestStandardDoble, NotificationChain msgs ) {
        DobleStandard oldTestStandardDoble = testStandardDoble;
        testStandardDoble = newTestStandardDoble;
        boolean oldTestStandardDobleESet = testStandardDobleESet;
        testStandardDobleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE, oldTestStandardDoble, newTestStandardDoble,
                    !oldTestStandardDobleESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardDoble( DobleStandard newTestStandardDoble ) {
        if( newTestStandardDoble != testStandardDoble ) {
            NotificationChain msgs = null;
            if( testStandardDoble != null ) msgs = ( ( InternalEObject ) testStandardDoble ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE, null, msgs );
            if( newTestStandardDoble != null ) msgs = ( ( InternalEObject ) newTestStandardDoble ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE, null, msgs );
            msgs = basicSetTestStandardDoble( newTestStandardDoble, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardDobleESet = testStandardDobleESet;
            testStandardDobleESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE,
                        newTestStandardDoble, newTestStandardDoble, !oldTestStandardDobleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardDoble( NotificationChain msgs ) {
        DobleStandard oldTestStandardDoble = testStandardDoble;
        testStandardDoble = null;
        boolean oldTestStandardDobleESet = testStandardDobleESet;
        testStandardDobleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE, oldTestStandardDoble, null,
                    oldTestStandardDobleESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardDoble() {
        if( testStandardDoble != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardDoble ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE, null, msgs );
            msgs = basicUnsetTestStandardDoble( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardDobleESet = testStandardDobleESet;
            testStandardDobleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE, null, null, oldTestStandardDobleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardDoble() {
        return testStandardDobleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EPAStandard getTestStandardEPA() {
        return testStandardEPA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardEPA( EPAStandard newTestStandardEPA, NotificationChain msgs ) {
        EPAStandard oldTestStandardEPA = testStandardEPA;
        testStandardEPA = newTestStandardEPA;
        boolean oldTestStandardEPAESet = testStandardEPAESet;
        testStandardEPAESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_EPA, oldTestStandardEPA, newTestStandardEPA,
                    !oldTestStandardEPAESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardEPA( EPAStandard newTestStandardEPA ) {
        if( newTestStandardEPA != testStandardEPA ) {
            NotificationChain msgs = null;
            if( testStandardEPA != null ) msgs = ( ( InternalEObject ) testStandardEPA ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_EPA, null, msgs );
            if( newTestStandardEPA != null ) msgs = ( ( InternalEObject ) newTestStandardEPA ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_EPA, null, msgs );
            msgs = basicSetTestStandardEPA( newTestStandardEPA, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardEPAESet = testStandardEPAESet;
            testStandardEPAESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_EPA,
                        newTestStandardEPA, newTestStandardEPA, !oldTestStandardEPAESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardEPA( NotificationChain msgs ) {
        EPAStandard oldTestStandardEPA = testStandardEPA;
        testStandardEPA = null;
        boolean oldTestStandardEPAESet = testStandardEPAESet;
        testStandardEPAESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_EPA, oldTestStandardEPA, null, oldTestStandardEPAESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardEPA() {
        if( testStandardEPA != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardEPA ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_EPA, null, msgs );
            msgs = basicUnsetTestStandardEPA( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardEPAESet = testStandardEPAESet;
            testStandardEPAESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_EPA, null, null, oldTestStandardEPAESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardEPA() {
        return testStandardEPAESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IECStandard getTestStandardIEC() {
        return testStandardIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardIEC( IECStandard newTestStandardIEC, NotificationChain msgs ) {
        IECStandard oldTestStandardIEC = testStandardIEC;
        testStandardIEC = newTestStandardIEC;
        boolean oldTestStandardIECESet = testStandardIECESet;
        testStandardIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_IEC, oldTestStandardIEC, newTestStandardIEC,
                    !oldTestStandardIECESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardIEC( IECStandard newTestStandardIEC ) {
        if( newTestStandardIEC != testStandardIEC ) {
            NotificationChain msgs = null;
            if( testStandardIEC != null ) msgs = ( ( InternalEObject ) testStandardIEC ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_IEC, null, msgs );
            if( newTestStandardIEC != null ) msgs = ( ( InternalEObject ) newTestStandardIEC ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_IEC, null, msgs );
            msgs = basicSetTestStandardIEC( newTestStandardIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardIECESet = testStandardIECESet;
            testStandardIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_IEC,
                        newTestStandardIEC, newTestStandardIEC, !oldTestStandardIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardIEC( NotificationChain msgs ) {
        IECStandard oldTestStandardIEC = testStandardIEC;
        testStandardIEC = null;
        boolean oldTestStandardIECESet = testStandardIECESet;
        testStandardIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_IEC, oldTestStandardIEC, null, oldTestStandardIECESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardIEC() {
        if( testStandardIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardIEC ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_IEC, null, msgs );
            msgs = basicUnsetTestStandardIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardIECESet = testStandardIECESet;
            testStandardIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_IEC, null, null, oldTestStandardIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardIEC() {
        return testStandardIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEEEStandard getTestStandardIEEE() {
        return testStandardIEEE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardIEEE( IEEEStandard newTestStandardIEEE, NotificationChain msgs ) {
        IEEEStandard oldTestStandardIEEE = testStandardIEEE;
        testStandardIEEE = newTestStandardIEEE;
        boolean oldTestStandardIEEEESet = testStandardIEEEESet;
        testStandardIEEEESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE, oldTestStandardIEEE, newTestStandardIEEE,
                    !oldTestStandardIEEEESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardIEEE( IEEEStandard newTestStandardIEEE ) {
        if( newTestStandardIEEE != testStandardIEEE ) {
            NotificationChain msgs = null;
            if( testStandardIEEE != null ) msgs = ( ( InternalEObject ) testStandardIEEE ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE, null, msgs );
            if( newTestStandardIEEE != null ) msgs = ( ( InternalEObject ) newTestStandardIEEE ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE, null, msgs );
            msgs = basicSetTestStandardIEEE( newTestStandardIEEE, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardIEEEESet = testStandardIEEEESet;
            testStandardIEEEESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE,
                        newTestStandardIEEE, newTestStandardIEEE, !oldTestStandardIEEEESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardIEEE( NotificationChain msgs ) {
        IEEEStandard oldTestStandardIEEE = testStandardIEEE;
        testStandardIEEE = null;
        boolean oldTestStandardIEEEESet = testStandardIEEEESet;
        testStandardIEEEESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE, oldTestStandardIEEE, null, oldTestStandardIEEEESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardIEEE() {
        if( testStandardIEEE != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardIEEE ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE, null, msgs );
            msgs = basicUnsetTestStandardIEEE( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardIEEEESet = testStandardIEEEESet;
            testStandardIEEEESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE, null, null, oldTestStandardIEEEESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardIEEE() {
        return testStandardIEEEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ISOStandard getTestStandardISO() {
        return testStandardISO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardISO( ISOStandard newTestStandardISO, NotificationChain msgs ) {
        ISOStandard oldTestStandardISO = testStandardISO;
        testStandardISO = newTestStandardISO;
        boolean oldTestStandardISOESet = testStandardISOESet;
        testStandardISOESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_ISO, oldTestStandardISO, newTestStandardISO,
                    !oldTestStandardISOESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardISO( ISOStandard newTestStandardISO ) {
        if( newTestStandardISO != testStandardISO ) {
            NotificationChain msgs = null;
            if( testStandardISO != null ) msgs = ( ( InternalEObject ) testStandardISO ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_ISO, null, msgs );
            if( newTestStandardISO != null ) msgs = ( ( InternalEObject ) newTestStandardISO ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_ISO, null, msgs );
            msgs = basicSetTestStandardISO( newTestStandardISO, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardISOESet = testStandardISOESet;
            testStandardISOESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_ISO,
                        newTestStandardISO, newTestStandardISO, !oldTestStandardISOESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardISO( NotificationChain msgs ) {
        ISOStandard oldTestStandardISO = testStandardISO;
        testStandardISO = null;
        boolean oldTestStandardISOESet = testStandardISOESet;
        testStandardISOESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_ISO, oldTestStandardISO, null, oldTestStandardISOESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardISO() {
        if( testStandardISO != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardISO ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_ISO, null, msgs );
            msgs = basicUnsetTestStandardISO( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardISOESet = testStandardISOESet;
            testStandardISOESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_ISO, null, null, oldTestStandardISOESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardISO() {
        return testStandardISOESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LaborelecStandard getTestStandardLaborelec() {
        return testStandardLaborelec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardLaborelec( LaborelecStandard newTestStandardLaborelec,
            NotificationChain msgs ) {
        LaborelecStandard oldTestStandardLaborelec = testStandardLaborelec;
        testStandardLaborelec = newTestStandardLaborelec;
        boolean oldTestStandardLaborelecESet = testStandardLaborelecESet;
        testStandardLaborelecESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC, oldTestStandardLaborelec,
                    newTestStandardLaborelec, !oldTestStandardLaborelecESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardLaborelec( LaborelecStandard newTestStandardLaborelec ) {
        if( newTestStandardLaborelec != testStandardLaborelec ) {
            NotificationChain msgs = null;
            if( testStandardLaborelec != null )
                msgs = ( ( InternalEObject ) testStandardLaborelec ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC, null, msgs );
            if( newTestStandardLaborelec != null )
                msgs = ( ( InternalEObject ) newTestStandardLaborelec ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC, null, msgs );
            msgs = basicSetTestStandardLaborelec( newTestStandardLaborelec, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardLaborelecESet = testStandardLaborelecESet;
            testStandardLaborelecESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC,
                            newTestStandardLaborelec, newTestStandardLaborelec, !oldTestStandardLaborelecESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardLaborelec( NotificationChain msgs ) {
        LaborelecStandard oldTestStandardLaborelec = testStandardLaborelec;
        testStandardLaborelec = null;
        boolean oldTestStandardLaborelecESet = testStandardLaborelecESet;
        testStandardLaborelecESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC, oldTestStandardLaborelec, null,
                    oldTestStandardLaborelecESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardLaborelec() {
        if( testStandardLaborelec != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardLaborelec ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC, null, msgs );
            msgs = basicUnsetTestStandardLaborelec( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardLaborelecESet = testStandardLaborelecESet;
            testStandardLaborelecESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC, null, null, oldTestStandardLaborelecESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardLaborelec() {
        return testStandardLaborelecESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TAPPIStandard getTestStandardTAPPI() {
        return testStandardTAPPI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardTAPPI( TAPPIStandard newTestStandardTAPPI, NotificationChain msgs ) {
        TAPPIStandard oldTestStandardTAPPI = testStandardTAPPI;
        testStandardTAPPI = newTestStandardTAPPI;
        boolean oldTestStandardTAPPIESet = testStandardTAPPIESet;
        testStandardTAPPIESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI, oldTestStandardTAPPI, newTestStandardTAPPI,
                    !oldTestStandardTAPPIESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardTAPPI( TAPPIStandard newTestStandardTAPPI ) {
        if( newTestStandardTAPPI != testStandardTAPPI ) {
            NotificationChain msgs = null;
            if( testStandardTAPPI != null ) msgs = ( ( InternalEObject ) testStandardTAPPI ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI, null, msgs );
            if( newTestStandardTAPPI != null ) msgs = ( ( InternalEObject ) newTestStandardTAPPI ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI, null, msgs );
            msgs = basicSetTestStandardTAPPI( newTestStandardTAPPI, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardTAPPIESet = testStandardTAPPIESet;
            testStandardTAPPIESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI,
                        newTestStandardTAPPI, newTestStandardTAPPI, !oldTestStandardTAPPIESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardTAPPI( NotificationChain msgs ) {
        TAPPIStandard oldTestStandardTAPPI = testStandardTAPPI;
        testStandardTAPPI = null;
        boolean oldTestStandardTAPPIESet = testStandardTAPPIESet;
        testStandardTAPPIESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI, oldTestStandardTAPPI, null,
                    oldTestStandardTAPPIESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardTAPPI() {
        if( testStandardTAPPI != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardTAPPI ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI, null, msgs );
            msgs = basicUnsetTestStandardTAPPI( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardTAPPIESet = testStandardTAPPIESet;
            testStandardTAPPIESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI, null, null, oldTestStandardTAPPIESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardTAPPI() {
        return testStandardTAPPIESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UKMinistryOfDefenceStandard getTestStandardUKMinistryOfDefence() {
        return testStandardUKMinistryOfDefence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardUKMinistryOfDefence(
            UKMinistryOfDefenceStandard newTestStandardUKMinistryOfDefence, NotificationChain msgs ) {
        UKMinistryOfDefenceStandard oldTestStandardUKMinistryOfDefence = testStandardUKMinistryOfDefence;
        testStandardUKMinistryOfDefence = newTestStandardUKMinistryOfDefence;
        boolean oldTestStandardUKMinistryOfDefenceESet = testStandardUKMinistryOfDefenceESet;
        testStandardUKMinistryOfDefenceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE, oldTestStandardUKMinistryOfDefence,
                    newTestStandardUKMinistryOfDefence, !oldTestStandardUKMinistryOfDefenceESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardUKMinistryOfDefence( UKMinistryOfDefenceStandard newTestStandardUKMinistryOfDefence ) {
        if( newTestStandardUKMinistryOfDefence != testStandardUKMinistryOfDefence ) {
            NotificationChain msgs = null;
            if( testStandardUKMinistryOfDefence != null )
                msgs = ( ( InternalEObject ) testStandardUKMinistryOfDefence ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE, null,
                        msgs );
            if( newTestStandardUKMinistryOfDefence != null )
                msgs = ( ( InternalEObject ) newTestStandardUKMinistryOfDefence ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE, null,
                        msgs );
            msgs = basicSetTestStandardUKMinistryOfDefence( newTestStandardUKMinistryOfDefence, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardUKMinistryOfDefenceESet = testStandardUKMinistryOfDefenceESet;
            testStandardUKMinistryOfDefenceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE, newTestStandardUKMinistryOfDefence,
                    newTestStandardUKMinistryOfDefence, !oldTestStandardUKMinistryOfDefenceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardUKMinistryOfDefence( NotificationChain msgs ) {
        UKMinistryOfDefenceStandard oldTestStandardUKMinistryOfDefence = testStandardUKMinistryOfDefence;
        testStandardUKMinistryOfDefence = null;
        boolean oldTestStandardUKMinistryOfDefenceESet = testStandardUKMinistryOfDefenceESet;
        testStandardUKMinistryOfDefenceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE, oldTestStandardUKMinistryOfDefence,
                    null, oldTestStandardUKMinistryOfDefenceESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardUKMinistryOfDefence() {
        if( testStandardUKMinistryOfDefence != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardUKMinistryOfDefence ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE, null,
                    msgs );
            msgs = basicUnsetTestStandardUKMinistryOfDefence( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardUKMinistryOfDefenceESet = testStandardUKMinistryOfDefenceESet;
            testStandardUKMinistryOfDefenceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE, null, null,
                    oldTestStandardUKMinistryOfDefenceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardUKMinistryOfDefence() {
        return testStandardUKMinistryOfDefenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WEPStandard getTestStandardWEP() {
        return testStandardWEP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandardWEP( WEPStandard newTestStandardWEP, NotificationChain msgs ) {
        WEPStandard oldTestStandardWEP = testStandardWEP;
        testStandardWEP = newTestStandardWEP;
        boolean oldTestStandardWEPESet = testStandardWEPESet;
        testStandardWEPESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_WEP, oldTestStandardWEP, newTestStandardWEP,
                    !oldTestStandardWEPESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestStandardWEP( WEPStandard newTestStandardWEP ) {
        if( newTestStandardWEP != testStandardWEP ) {
            NotificationChain msgs = null;
            if( testStandardWEP != null ) msgs = ( ( InternalEObject ) testStandardWEP ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_WEP, null, msgs );
            if( newTestStandardWEP != null ) msgs = ( ( InternalEObject ) newTestStandardWEP ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_WEP, null, msgs );
            msgs = basicSetTestStandardWEP( newTestStandardWEP, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardWEPESet = testStandardWEPESet;
            testStandardWEPESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_STANDARD__TEST_STANDARD_WEP,
                        newTestStandardWEP, newTestStandardWEP, !oldTestStandardWEPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandardWEP( NotificationChain msgs ) {
        WEPStandard oldTestStandardWEP = testStandardWEP;
        testStandardWEP = null;
        boolean oldTestStandardWEPESet = testStandardWEPESet;
        testStandardWEPESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_WEP, oldTestStandardWEP, null, oldTestStandardWEPESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestStandardWEP() {
        if( testStandardWEP != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandardWEP ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TEST_STANDARD__TEST_STANDARD_WEP, null, msgs );
            msgs = basicUnsetTestStandardWEP( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardWEPESet = testStandardWEPESet;
            testStandardWEPESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TEST_STANDARD__TEST_STANDARD_WEP, null, null, oldTestStandardWEPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandardWEP() {
        return testStandardWEPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetStringMeasurement > getAssetString() {
        if( assetString == null ) {
            assetString = new EObjectWithInverseResolvingEList.Unsettable< AssetStringMeasurement >(
                    AssetStringMeasurement.class, this, CimPackage.TEST_STANDARD__ASSET_STRING,
                    CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD );
        }
        return assetString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetString() {
        if( assetString != null ) ( ( InternalEList.Unsettable< ? > ) assetString ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetString() {
        return assetString != null && ( ( InternalEList.Unsettable< ? > ) assetString ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetDiscrete > getAssetDiscrete() {
        if( assetDiscrete == null ) {
            assetDiscrete = new EObjectWithInverseResolvingEList.Unsettable< AssetDiscrete >( AssetDiscrete.class, this,
                    CimPackage.TEST_STANDARD__ASSET_DISCRETE, CimPackage.ASSET_DISCRETE__TEST_STANDARD );
        }
        return assetDiscrete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetDiscrete() {
        if( assetDiscrete != null ) ( ( InternalEList.Unsettable< ? > ) assetDiscrete ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetDiscrete() {
        return assetDiscrete != null && ( ( InternalEList.Unsettable< ? > ) assetDiscrete ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetAnalog > getAssetAnalog() {
        if( assetAnalog == null ) {
            assetAnalog = new EObjectWithInverseResolvingEList.Unsettable< AssetAnalog >( AssetAnalog.class, this,
                    CimPackage.TEST_STANDARD__ASSET_ANALOG, CimPackage.ASSET_ANALOG__TEST_STANDARD );
        }
        return assetAnalog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssetAnalog() {
        if( assetAnalog != null ) ( ( InternalEList.Unsettable< ? > ) assetAnalog ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetAnalog() {
        return assetAnalog != null && ( ( InternalEList.Unsettable< ? > ) assetAnalog ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TEST_STANDARD__ASSET_STRING:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssetString() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TEST_STANDARD__ASSET_DISCRETE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssetDiscrete() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TEST_STANDARD__ASSET_ANALOG:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssetAnalog() ).basicAdd( otherEnd,
                    msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM:
            return basicUnsetTestStandardASTM( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE:
            return basicUnsetTestStandardCIGRE( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DIN:
            return basicUnsetTestStandardDIN( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE:
            return basicUnsetTestStandardDoble( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_EPA:
            return basicUnsetTestStandardEPA( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEC:
            return basicUnsetTestStandardIEC( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE:
            return basicUnsetTestStandardIEEE( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ISO:
            return basicUnsetTestStandardISO( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC:
            return basicUnsetTestStandardLaborelec( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI:
            return basicUnsetTestStandardTAPPI( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE:
            return basicUnsetTestStandardUKMinistryOfDefence( msgs );
        case CimPackage.TEST_STANDARD__TEST_STANDARD_WEP:
            return basicUnsetTestStandardWEP( msgs );
        case CimPackage.TEST_STANDARD__ASSET_STRING:
            return ( ( InternalEList< ? > ) getAssetString() ).basicRemove( otherEnd, msgs );
        case CimPackage.TEST_STANDARD__ASSET_DISCRETE:
            return ( ( InternalEList< ? > ) getAssetDiscrete() ).basicRemove( otherEnd, msgs );
        case CimPackage.TEST_STANDARD__ASSET_ANALOG:
            return ( ( InternalEList< ? > ) getAssetAnalog() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TEST_STANDARD__TEST_METHOD:
            return getTestMethod();
        case CimPackage.TEST_STANDARD__TEST_VARIANT:
            return getTestVariant();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM:
            return getTestStandardASTM();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE:
            return getTestStandardCIGRE();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DIN:
            return getTestStandardDIN();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE:
            return getTestStandardDoble();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_EPA:
            return getTestStandardEPA();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEC:
            return getTestStandardIEC();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE:
            return getTestStandardIEEE();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ISO:
            return getTestStandardISO();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC:
            return getTestStandardLaborelec();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI:
            return getTestStandardTAPPI();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE:
            return getTestStandardUKMinistryOfDefence();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_WEP:
            return getTestStandardWEP();
        case CimPackage.TEST_STANDARD__ASSET_STRING:
            return getAssetString();
        case CimPackage.TEST_STANDARD__ASSET_DISCRETE:
            return getAssetDiscrete();
        case CimPackage.TEST_STANDARD__ASSET_ANALOG:
            return getAssetAnalog();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.TEST_STANDARD__TEST_METHOD:
            setTestMethod( ( TestMethod ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_VARIANT:
            setTestVariant( ( TestVariantKind ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM:
            setTestStandardASTM( ( ASTMStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE:
            setTestStandardCIGRE( ( CIGREStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DIN:
            setTestStandardDIN( ( DINStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE:
            setTestStandardDoble( ( DobleStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_EPA:
            setTestStandardEPA( ( EPAStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEC:
            setTestStandardIEC( ( IECStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE:
            setTestStandardIEEE( ( IEEEStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ISO:
            setTestStandardISO( ( ISOStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC:
            setTestStandardLaborelec( ( LaborelecStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI:
            setTestStandardTAPPI( ( TAPPIStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE:
            setTestStandardUKMinistryOfDefence( ( UKMinistryOfDefenceStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_WEP:
            setTestStandardWEP( ( WEPStandard ) newValue );
            return;
        case CimPackage.TEST_STANDARD__ASSET_STRING:
            getAssetString().clear();
            getAssetString().addAll( ( Collection< ? extends AssetStringMeasurement > ) newValue );
            return;
        case CimPackage.TEST_STANDARD__ASSET_DISCRETE:
            getAssetDiscrete().clear();
            getAssetDiscrete().addAll( ( Collection< ? extends AssetDiscrete > ) newValue );
            return;
        case CimPackage.TEST_STANDARD__ASSET_ANALOG:
            getAssetAnalog().clear();
            getAssetAnalog().addAll( ( Collection< ? extends AssetAnalog > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.TEST_STANDARD__TEST_METHOD:
            unsetTestMethod();
            return;
        case CimPackage.TEST_STANDARD__TEST_VARIANT:
            unsetTestVariant();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM:
            unsetTestStandardASTM();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE:
            unsetTestStandardCIGRE();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DIN:
            unsetTestStandardDIN();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE:
            unsetTestStandardDoble();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_EPA:
            unsetTestStandardEPA();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEC:
            unsetTestStandardIEC();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE:
            unsetTestStandardIEEE();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ISO:
            unsetTestStandardISO();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC:
            unsetTestStandardLaborelec();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI:
            unsetTestStandardTAPPI();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE:
            unsetTestStandardUKMinistryOfDefence();
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_WEP:
            unsetTestStandardWEP();
            return;
        case CimPackage.TEST_STANDARD__ASSET_STRING:
            unsetAssetString();
            return;
        case CimPackage.TEST_STANDARD__ASSET_DISCRETE:
            unsetAssetDiscrete();
            return;
        case CimPackage.TEST_STANDARD__ASSET_ANALOG:
            unsetAssetAnalog();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.TEST_STANDARD__TEST_METHOD:
            return isSetTestMethod();
        case CimPackage.TEST_STANDARD__TEST_VARIANT:
            return isSetTestVariant();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM:
            return isSetTestStandardASTM();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE:
            return isSetTestStandardCIGRE();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DIN:
            return isSetTestStandardDIN();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE:
            return isSetTestStandardDoble();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_EPA:
            return isSetTestStandardEPA();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEC:
            return isSetTestStandardIEC();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE:
            return isSetTestStandardIEEE();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ISO:
            return isSetTestStandardISO();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC:
            return isSetTestStandardLaborelec();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI:
            return isSetTestStandardTAPPI();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE:
            return isSetTestStandardUKMinistryOfDefence();
        case CimPackage.TEST_STANDARD__TEST_STANDARD_WEP:
            return isSetTestStandardWEP();
        case CimPackage.TEST_STANDARD__ASSET_STRING:
            return isSetAssetString();
        case CimPackage.TEST_STANDARD__ASSET_DISCRETE:
            return isSetAssetDiscrete();
        case CimPackage.TEST_STANDARD__ASSET_ANALOG:
            return isSetAssetAnalog();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (testMethod: " );
        if( testMethodESet )
            result.append( testMethod );
        else
            result.append( "<unset>" );
        result.append( ", testVariant: " );
        if( testVariantESet )
            result.append( testVariant );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TestStandardImpl
