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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Cashier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ElectronicAddress;

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
 * An implementation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CashierImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CashierImpl#getCashierShifts <em>Cashier Shifts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashierImpl extends IdentifiedObjectImpl implements Cashier {
    /**
     * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectronicAddress()
     * @generated
     * @ordered
     */
    protected ElectronicAddress electronicAddress;

    /**
     * This is true if the Electronic Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean electronicAddressESet;

    /**
     * The cached value of the '{@link #getCashierShifts() <em>Cashier Shifts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCashierShifts()
     * @generated
     * @ordered
     */
    protected EList< CashierShift > cashierShifts;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CashierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCashier();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElectronicAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElectronicAddress( ElectronicAddress newElectronicAddress,
            NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = newElectronicAddress;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CASHIER__ELECTRONIC_ADDRESS, oldElectronicAddress, newElectronicAddress,
                    !oldElectronicAddressESet );
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
    public void setElectronicAddress( ElectronicAddress newElectronicAddress ) {
        if( newElectronicAddress != electronicAddress ) {
            NotificationChain msgs = null;
            if( electronicAddress != null ) msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CASHIER__ELECTRONIC_ADDRESS, null, msgs );
            if( newElectronicAddress != null ) msgs = ( ( InternalEObject ) newElectronicAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CASHIER__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicSetElectronicAddress( newElectronicAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CASHIER__ELECTRONIC_ADDRESS,
                        newElectronicAddress, newElectronicAddress, !oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetElectronicAddress( NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = null;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CASHIER__ELECTRONIC_ADDRESS, oldElectronicAddress, null, oldElectronicAddressESet );
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
    public void unsetElectronicAddress() {
        if( electronicAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CASHIER__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicUnsetElectronicAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CASHIER__ELECTRONIC_ADDRESS, null, null, oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicAddress() {
        return electronicAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CashierShift > getCashierShifts() {
        if( cashierShifts == null ) {
            cashierShifts = new EObjectWithInverseResolvingEList.Unsettable< CashierShift >( CashierShift.class, this,
                    CimPackage.CASHIER__CASHIER_SHIFTS, CimPackage.CASHIER_SHIFT__CASHIER );
        }
        return cashierShifts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCashierShifts() {
        if( cashierShifts != null ) ( ( InternalEList.Unsettable< ? > ) cashierShifts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCashierShifts() {
        return cashierShifts != null && ( ( InternalEList.Unsettable< ? > ) cashierShifts ).isSet();
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
        case CimPackage.CASHIER__CASHIER_SHIFTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCashierShifts() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.CASHIER__ELECTRONIC_ADDRESS:
            return basicUnsetElectronicAddress( msgs );
        case CimPackage.CASHIER__CASHIER_SHIFTS:
            return ( ( InternalEList< ? > ) getCashierShifts() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CASHIER__ELECTRONIC_ADDRESS:
            return getElectronicAddress();
        case CimPackage.CASHIER__CASHIER_SHIFTS:
            return getCashierShifts();
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
        case CimPackage.CASHIER__ELECTRONIC_ADDRESS:
            setElectronicAddress( ( ElectronicAddress ) newValue );
            return;
        case CimPackage.CASHIER__CASHIER_SHIFTS:
            getCashierShifts().clear();
            getCashierShifts().addAll( ( Collection< ? extends CashierShift > ) newValue );
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
        case CimPackage.CASHIER__ELECTRONIC_ADDRESS:
            unsetElectronicAddress();
            return;
        case CimPackage.CASHIER__CASHIER_SHIFTS:
            unsetCashierShifts();
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
        case CimPackage.CASHIER__ELECTRONIC_ADDRESS:
            return isSetElectronicAddress();
        case CimPackage.CASHIER__CASHIER_SHIFTS:
            return isSetCashierShifts();
        }
        return super.eIsSet( featureID );
    }

} //CashierImpl
