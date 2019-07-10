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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetStringKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetStringMeasurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset String Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetStringMeasurementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetStringMeasurementImpl#getTestStandard <em>Test Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetStringMeasurementImpl extends StringMeasurementImpl implements AssetStringMeasurement {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final AssetStringKind KIND_EDEFAULT = AssetStringKind.VISUAL_EXAM_REMARKS;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected AssetStringKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

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
    protected AssetStringMeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetStringMeasurement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetStringKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( AssetStringKind newKind ) {
        AssetStringKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_STRING_MEASUREMENT__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        AssetStringKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_STRING_MEASUREMENT__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
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
                    CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD, oldTestStandard, newTestStandard,
                    !oldTestStandardESet );
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
                    CimPackage.TEST_STANDARD__ASSET_STRING, TestStandard.class, msgs );
            if( newTestStandard != null ) msgs = ( ( InternalEObject ) newTestStandard ).eInverseAdd( this,
                    CimPackage.TEST_STANDARD__ASSET_STRING, TestStandard.class, msgs );
            msgs = basicSetTestStandard( newTestStandard, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardESet = testStandardESet;
            testStandardESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD,
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
                    CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD, oldTestStandard, null, oldTestStandardESet );
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
            msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this, CimPackage.TEST_STANDARD__ASSET_STRING,
                    TestStandard.class, msgs );
            msgs = basicUnsetTestStandard( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardESet = testStandardESet;
            testStandardESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD, null, null, oldTestStandardESet ) );
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
        case CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD:
            if( testStandard != null ) msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this,
                    CimPackage.TEST_STANDARD__ASSET_STRING, TestStandard.class, msgs );
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
        case CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD:
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
        case CimPackage.ASSET_STRING_MEASUREMENT__KIND:
            return getKind();
        case CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD:
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
        case CimPackage.ASSET_STRING_MEASUREMENT__KIND:
            setKind( ( AssetStringKind ) newValue );
            return;
        case CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD:
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
        case CimPackage.ASSET_STRING_MEASUREMENT__KIND:
            unsetKind();
            return;
        case CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD:
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
        case CimPackage.ASSET_STRING_MEASUREMENT__KIND:
            return isSetKind();
        case CimPackage.ASSET_STRING_MEASUREMENT__TEST_STANDARD:
            return isSetTestStandard();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetStringMeasurementImpl
