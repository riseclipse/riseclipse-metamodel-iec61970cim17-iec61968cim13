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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireAssemblyInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Phase Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePhaseInfoImpl#getPhaseInfo <em>Phase Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePhaseInfoImpl#getWireInfo <em>Wire Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePhaseInfoImpl#getWireAssemblyInfo <em>Wire Assembly Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePhaseInfoImpl#getWirePosition <em>Wire Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WirePhaseInfoImpl extends CimObjectWithIDImpl implements WirePhaseInfo {
    /**
     * The default value of the '{@link #getPhaseInfo() <em>Phase Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseInfo()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_INFO_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhaseInfo() <em>Phase Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseInfo()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phaseInfo = PHASE_INFO_EDEFAULT;

    /**
     * This is true if the Phase Info attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseInfoESet;

    /**
     * The cached value of the '{@link #getWireInfo() <em>Wire Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWireInfo()
     * @generated
     * @ordered
     */
    protected WireInfo wireInfo;

    /**
     * This is true if the Wire Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wireInfoESet;

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
     * The cached value of the '{@link #getWirePosition() <em>Wire Position</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWirePosition()
     * @generated
     * @ordered
     */
    protected WirePosition wirePosition;

    /**
     * This is true if the Wire Position reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wirePositionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WirePhaseInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWirePhaseInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SinglePhaseKind getPhaseInfo() {
        return phaseInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseInfo( SinglePhaseKind newPhaseInfo ) {
        SinglePhaseKind oldPhaseInfo = phaseInfo;
        phaseInfo = newPhaseInfo == null ? PHASE_INFO_EDEFAULT : newPhaseInfo;
        boolean oldPhaseInfoESet = phaseInfoESet;
        phaseInfoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_PHASE_INFO__PHASE_INFO, oldPhaseInfo, phaseInfo, !oldPhaseInfoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseInfo() {
        SinglePhaseKind oldPhaseInfo = phaseInfo;
        boolean oldPhaseInfoESet = phaseInfoESet;
        phaseInfo = PHASE_INFO_EDEFAULT;
        phaseInfoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_PHASE_INFO__PHASE_INFO, oldPhaseInfo, PHASE_INFO_EDEFAULT, oldPhaseInfoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseInfo() {
        return phaseInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireInfo getWireInfo() {
        return wireInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWireInfo( WireInfo newWireInfo, NotificationChain msgs ) {
        WireInfo oldWireInfo = wireInfo;
        wireInfo = newWireInfo;
        boolean oldWireInfoESet = wireInfoESet;
        wireInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_INFO, oldWireInfo, newWireInfo, !oldWireInfoESet );
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
    public void setWireInfo( WireInfo newWireInfo ) {
        if( newWireInfo != wireInfo ) {
            NotificationChain msgs = null;
            if( wireInfo != null ) msgs = ( ( InternalEObject ) wireInfo ).eInverseRemove( this,
                    CimPackage.WIRE_INFO__WIRE_PHASE_INFO, WireInfo.class, msgs );
            if( newWireInfo != null ) msgs = ( ( InternalEObject ) newWireInfo ).eInverseAdd( this,
                    CimPackage.WIRE_INFO__WIRE_PHASE_INFO, WireInfo.class, msgs );
            msgs = basicSetWireInfo( newWireInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireInfoESet = wireInfoESet;
            wireInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_INFO, newWireInfo, newWireInfo, !oldWireInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWireInfo( NotificationChain msgs ) {
        WireInfo oldWireInfo = wireInfo;
        wireInfo = null;
        boolean oldWireInfoESet = wireInfoESet;
        wireInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_INFO, oldWireInfo, null, oldWireInfoESet );
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
    public void unsetWireInfo() {
        if( wireInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) wireInfo ).eInverseRemove( this, CimPackage.WIRE_INFO__WIRE_PHASE_INFO,
                    WireInfo.class, msgs );
            msgs = basicUnsetWireInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireInfoESet = wireInfoESet;
            wireInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_INFO, null, null, oldWireInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWireInfo() {
        return wireInfoESet;
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
                    CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO, oldWireAssemblyInfo, newWireAssemblyInfo,
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
                    CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO, WireAssemblyInfo.class, msgs );
            if( newWireAssemblyInfo != null ) msgs = ( ( InternalEObject ) newWireAssemblyInfo ).eInverseAdd( this,
                    CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO, WireAssemblyInfo.class, msgs );
            msgs = basicSetWireAssemblyInfo( newWireAssemblyInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireAssemblyInfoESet = wireAssemblyInfoESet;
            wireAssemblyInfoESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO,
                        newWireAssemblyInfo, newWireAssemblyInfo, !oldWireAssemblyInfoESet ) );
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
                    CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO, oldWireAssemblyInfo, null,
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
                    CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO, WireAssemblyInfo.class, msgs );
            msgs = basicUnsetWireAssemblyInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireAssemblyInfoESet = wireAssemblyInfoESet;
            wireAssemblyInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO, null, null, oldWireAssemblyInfoESet ) );
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
    public WirePosition getWirePosition() {
        return wirePosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWirePosition( WirePosition newWirePosition, NotificationChain msgs ) {
        WirePosition oldWirePosition = wirePosition;
        wirePosition = newWirePosition;
        boolean oldWirePositionESet = wirePositionESet;
        wirePositionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_POSITION, oldWirePosition, newWirePosition, !oldWirePositionESet );
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
    public void setWirePosition( WirePosition newWirePosition ) {
        if( newWirePosition != wirePosition ) {
            NotificationChain msgs = null;
            if( wirePosition != null ) msgs = ( ( InternalEObject ) wirePosition ).eInverseRemove( this,
                    CimPackage.WIRE_POSITION__WIRE_PHASE_INFO, WirePosition.class, msgs );
            if( newWirePosition != null ) msgs = ( ( InternalEObject ) newWirePosition ).eInverseAdd( this,
                    CimPackage.WIRE_POSITION__WIRE_PHASE_INFO, WirePosition.class, msgs );
            msgs = basicSetWirePosition( newWirePosition, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWirePositionESet = wirePositionESet;
            wirePositionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_PHASE_INFO__WIRE_POSITION,
                        newWirePosition, newWirePosition, !oldWirePositionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWirePosition( NotificationChain msgs ) {
        WirePosition oldWirePosition = wirePosition;
        wirePosition = null;
        boolean oldWirePositionESet = wirePositionESet;
        wirePositionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_POSITION, oldWirePosition, null, oldWirePositionESet );
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
    public void unsetWirePosition() {
        if( wirePosition != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) wirePosition ).eInverseRemove( this, CimPackage.WIRE_POSITION__WIRE_PHASE_INFO,
                    WirePosition.class, msgs );
            msgs = basicUnsetWirePosition( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWirePositionESet = wirePositionESet;
            wirePositionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_PHASE_INFO__WIRE_POSITION, null, null, oldWirePositionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWirePosition() {
        return wirePositionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIRE_PHASE_INFO__WIRE_INFO:
            if( wireInfo != null ) msgs = ( ( InternalEObject ) wireInfo ).eInverseRemove( this,
                    CimPackage.WIRE_INFO__WIRE_PHASE_INFO, WireInfo.class, msgs );
            return basicSetWireInfo( ( WireInfo ) otherEnd, msgs );
        case CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO:
            if( wireAssemblyInfo != null ) msgs = ( ( InternalEObject ) wireAssemblyInfo ).eInverseRemove( this,
                    CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO, WireAssemblyInfo.class, msgs );
            return basicSetWireAssemblyInfo( ( WireAssemblyInfo ) otherEnd, msgs );
        case CimPackage.WIRE_PHASE_INFO__WIRE_POSITION:
            if( wirePosition != null ) msgs = ( ( InternalEObject ) wirePosition ).eInverseRemove( this,
                    CimPackage.WIRE_POSITION__WIRE_PHASE_INFO, WirePosition.class, msgs );
            return basicSetWirePosition( ( WirePosition ) otherEnd, msgs );
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
        case CimPackage.WIRE_PHASE_INFO__WIRE_INFO:
            return basicUnsetWireInfo( msgs );
        case CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO:
            return basicUnsetWireAssemblyInfo( msgs );
        case CimPackage.WIRE_PHASE_INFO__WIRE_POSITION:
            return basicUnsetWirePosition( msgs );
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
        case CimPackage.WIRE_PHASE_INFO__PHASE_INFO:
            return getPhaseInfo();
        case CimPackage.WIRE_PHASE_INFO__WIRE_INFO:
            return getWireInfo();
        case CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO:
            return getWireAssemblyInfo();
        case CimPackage.WIRE_PHASE_INFO__WIRE_POSITION:
            return getWirePosition();
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
        case CimPackage.WIRE_PHASE_INFO__PHASE_INFO:
            setPhaseInfo( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.WIRE_PHASE_INFO__WIRE_INFO:
            setWireInfo( ( WireInfo ) newValue );
            return;
        case CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO:
            setWireAssemblyInfo( ( WireAssemblyInfo ) newValue );
            return;
        case CimPackage.WIRE_PHASE_INFO__WIRE_POSITION:
            setWirePosition( ( WirePosition ) newValue );
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
        case CimPackage.WIRE_PHASE_INFO__PHASE_INFO:
            unsetPhaseInfo();
            return;
        case CimPackage.WIRE_PHASE_INFO__WIRE_INFO:
            unsetWireInfo();
            return;
        case CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO:
            unsetWireAssemblyInfo();
            return;
        case CimPackage.WIRE_PHASE_INFO__WIRE_POSITION:
            unsetWirePosition();
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
        case CimPackage.WIRE_PHASE_INFO__PHASE_INFO:
            return isSetPhaseInfo();
        case CimPackage.WIRE_PHASE_INFO__WIRE_INFO:
            return isSetWireInfo();
        case CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO:
            return isSetWireAssemblyInfo();
        case CimPackage.WIRE_PHASE_INFO__WIRE_POSITION:
            return isSetWirePosition();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (phaseInfo: " );
        if( phaseInfoESet )
            result.append( phaseInfo );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WirePhaseInfoImpl
