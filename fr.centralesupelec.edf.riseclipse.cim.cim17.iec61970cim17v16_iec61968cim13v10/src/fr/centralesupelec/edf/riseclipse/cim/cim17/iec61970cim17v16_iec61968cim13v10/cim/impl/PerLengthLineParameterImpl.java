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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthLineParameter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireAssemblyInfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Length Line Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthLineParameterImpl#getWireAssemblyInfo <em>Wire Assembly Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerLengthLineParameterImpl extends IdentifiedObjectImpl implements PerLengthLineParameter {
    /**
     * The cached value of the '{@link #getWireAssemblyInfo() <em>Wire Assembly Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWireAssemblyInfo()
     * @generated
     * @ordered
     */
    protected WireAssemblyInfo wireAssemblyInfo;

    /**
     * This is true if the Wire Assembly Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wireAssemblyInfoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerLengthLineParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPerLengthLineParameter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireAssemblyInfo getWireAssemblyInfo() {
        return wireAssemblyInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWireAssemblyInfo( WireAssemblyInfo newWireAssemblyInfo, NotificationChain msgs ) {
        WireAssemblyInfo oldWireAssemblyInfo = wireAssemblyInfo;
        wireAssemblyInfo = newWireAssemblyInfo;
        boolean oldWireAssemblyInfoESet = wireAssemblyInfoESet;
        wireAssemblyInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO, oldWireAssemblyInfo, newWireAssemblyInfo,
                    !oldWireAssemblyInfoESet );
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
    public void setWireAssemblyInfo( WireAssemblyInfo newWireAssemblyInfo ) {
        if( newWireAssemblyInfo != wireAssemblyInfo ) {
            NotificationChain msgs = null;
            if( wireAssemblyInfo != null ) msgs = ( ( InternalEObject ) wireAssemblyInfo ).eInverseRemove( this,
                    CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER, WireAssemblyInfo.class, msgs );
            if( newWireAssemblyInfo != null ) msgs = ( ( InternalEObject ) newWireAssemblyInfo ).eInverseAdd( this,
                    CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER, WireAssemblyInfo.class, msgs );
            msgs = basicSetWireAssemblyInfo( newWireAssemblyInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireAssemblyInfoESet = wireAssemblyInfoESet;
            wireAssemblyInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO, newWireAssemblyInfo, newWireAssemblyInfo,
                    !oldWireAssemblyInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWireAssemblyInfo( NotificationChain msgs ) {
        WireAssemblyInfo oldWireAssemblyInfo = wireAssemblyInfo;
        wireAssemblyInfo = null;
        boolean oldWireAssemblyInfoESet = wireAssemblyInfoESet;
        wireAssemblyInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO, oldWireAssemblyInfo, null,
                    oldWireAssemblyInfoESet );
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
    public void unsetWireAssemblyInfo() {
        if( wireAssemblyInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) wireAssemblyInfo ).eInverseRemove( this,
                    CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER, WireAssemblyInfo.class, msgs );
            msgs = basicUnsetWireAssemblyInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireAssemblyInfoESet = wireAssemblyInfoESet;
            wireAssemblyInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO, null, null, oldWireAssemblyInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWireAssemblyInfo() {
        return wireAssemblyInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO:
            if( wireAssemblyInfo != null ) msgs = ( ( InternalEObject ) wireAssemblyInfo ).eInverseRemove( this,
                    CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER, WireAssemblyInfo.class, msgs );
            return basicSetWireAssemblyInfo( ( WireAssemblyInfo ) otherEnd, msgs );
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO:
            return basicUnsetWireAssemblyInfo( msgs );
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO:
            return getWireAssemblyInfo();
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO:
            setWireAssemblyInfo( ( WireAssemblyInfo ) newValue );
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO:
            unsetWireAssemblyInfo();
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
        case CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO:
            return isSetWireAssemblyInfo();
        }
        return super.eIsSet( featureID );
    }

} //PerLengthLineParameterImpl
