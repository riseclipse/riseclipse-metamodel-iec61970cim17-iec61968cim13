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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDiscrete;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Discrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDiscreteImpl#getTestStandard <em>Test Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetDiscreteImpl extends DiscreteImpl implements AssetDiscrete {
    /**
     * The cached value of the '{@link #getTestStandard() <em>Test Standard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandard()
     * @generated
     * @ordered
     */
    protected TestStandard testStandard;

    /**
     * This is true if the Test Standard reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetDiscreteImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetDiscrete();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TestStandard getTestStandard() {
        return testStandard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandard( TestStandard newTestStandard, NotificationChain msgs ) {
        TestStandard oldTestStandard = testStandard;
        testStandard = newTestStandard;
        boolean oldTestStandardESet = testStandardESet;
        testStandardESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_DISCRETE__TEST_STANDARD, oldTestStandard, newTestStandard, !oldTestStandardESet );
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
    public void setTestStandard( TestStandard newTestStandard ) {
        if( newTestStandard != testStandard ) {
            NotificationChain msgs = null;
            if( testStandard != null ) msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this,
                    CimPackage.TEST_STANDARD__ASSET_DISCRETE, TestStandard.class, msgs );
            if( newTestStandard != null ) msgs = ( ( InternalEObject ) newTestStandard ).eInverseAdd( this,
                    CimPackage.TEST_STANDARD__ASSET_DISCRETE, TestStandard.class, msgs );
            msgs = basicSetTestStandard( newTestStandard, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardESet = testStandardESet;
            testStandardESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_DISCRETE__TEST_STANDARD,
                        newTestStandard, newTestStandard, !oldTestStandardESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandard( NotificationChain msgs ) {
        TestStandard oldTestStandard = testStandard;
        testStandard = null;
        boolean oldTestStandardESet = testStandardESet;
        testStandardESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DISCRETE__TEST_STANDARD, oldTestStandard, null, oldTestStandardESet );
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
    public void unsetTestStandard() {
        if( testStandard != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this, CimPackage.TEST_STANDARD__ASSET_DISCRETE,
                    TestStandard.class, msgs );
            msgs = basicUnsetTestStandard( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardESet = testStandardESet;
            testStandardESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DISCRETE__TEST_STANDARD, null, null, oldTestStandardESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandard() {
        return testStandardESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASSET_DISCRETE__TEST_STANDARD:
            if( testStandard != null ) msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this,
                    CimPackage.TEST_STANDARD__ASSET_DISCRETE, TestStandard.class, msgs );
            return basicSetTestStandard( ( TestStandard ) otherEnd, msgs );
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
        case CimPackage.ASSET_DISCRETE__TEST_STANDARD:
            return basicUnsetTestStandard( msgs );
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
        case CimPackage.ASSET_DISCRETE__TEST_STANDARD:
            return getTestStandard();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.ASSET_DISCRETE__TEST_STANDARD:
            setTestStandard( ( TestStandard ) newValue );
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
        case CimPackage.ASSET_DISCRETE__TEST_STANDARD:
            unsetTestStandard();
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
        case CimPackage.ASSET_DISCRETE__TEST_STANDARD:
            return isSetTestStandard();
        }
        return super.eIsSet( featureID );
    }

} //AssetDiscreteImpl
