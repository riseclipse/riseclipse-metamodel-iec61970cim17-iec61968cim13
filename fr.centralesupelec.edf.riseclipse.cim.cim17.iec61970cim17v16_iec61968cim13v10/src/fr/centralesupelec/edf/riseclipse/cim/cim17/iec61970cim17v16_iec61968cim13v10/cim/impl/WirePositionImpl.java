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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing;

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
 * An implementation of the model object '<em><b>Wire Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePositionImpl#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePositionImpl#getYCoord <em>YCoord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePositionImpl#getWireSpacingInfo <em>Wire Spacing Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WirePositionImpl#getWirePhaseInfo <em>Wire Phase Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WirePositionImpl extends IdentifiedObjectImpl implements WirePosition {
    /**
     * The default value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXCoord()
     * @generated
     * @ordered
     */
    protected static final Float XCOORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXCoord()
     * @generated
     * @ordered
     */
    protected Float xCoord = XCOORD_EDEFAULT;

    /**
     * This is true if the XCoord attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xCoordESet;

    /**
     * The default value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYCoord()
     * @generated
     * @ordered
     */
    protected static final Float YCOORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYCoord()
     * @generated
     * @ordered
     */
    protected Float yCoord = YCOORD_EDEFAULT;

    /**
     * This is true if the YCoord attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean yCoordESet;

    /**
     * The cached value of the '{@link #getWireSpacingInfo() <em>Wire Spacing Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWireSpacingInfo()
     * @generated
     * @ordered
     */
    protected WireSpacing wireSpacingInfo;

    /**
     * This is true if the Wire Spacing Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wireSpacingInfoESet;

    /**
     * The cached value of the '{@link #getWirePhaseInfo() <em>Wire Phase Info</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWirePhaseInfo()
     * @generated
     * @ordered
     */
    protected EList< WirePhaseInfo > wirePhaseInfo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WirePositionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWirePosition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXCoord() {
        return xCoord;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXCoord( Float newXCoord ) {
        Float oldXCoord = xCoord;
        xCoord = newXCoord;
        boolean oldXCoordESet = xCoordESet;
        xCoordESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_POSITION__XCOORD, oldXCoord, xCoord, !oldXCoordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXCoord() {
        Float oldXCoord = xCoord;
        boolean oldXCoordESet = xCoordESet;
        xCoord = XCOORD_EDEFAULT;
        xCoordESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_POSITION__XCOORD, oldXCoord, XCOORD_EDEFAULT, oldXCoordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXCoord() {
        return xCoordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getYCoord() {
        return yCoord;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYCoord( Float newYCoord ) {
        Float oldYCoord = yCoord;
        yCoord = newYCoord;
        boolean oldYCoordESet = yCoordESet;
        yCoordESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_POSITION__YCOORD, oldYCoord, yCoord, !oldYCoordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYCoord() {
        Float oldYCoord = yCoord;
        boolean oldYCoordESet = yCoordESet;
        yCoord = YCOORD_EDEFAULT;
        yCoordESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_POSITION__YCOORD, oldYCoord, YCOORD_EDEFAULT, oldYCoordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYCoord() {
        return yCoordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireSpacing getWireSpacingInfo() {
        return wireSpacingInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWireSpacingInfo( WireSpacing newWireSpacingInfo, NotificationChain msgs ) {
        WireSpacing oldWireSpacingInfo = wireSpacingInfo;
        wireSpacingInfo = newWireSpacingInfo;
        boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
        wireSpacingInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIRE_POSITION__WIRE_SPACING_INFO, oldWireSpacingInfo, newWireSpacingInfo,
                    !oldWireSpacingInfoESet );
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
    public void setWireSpacingInfo( WireSpacing newWireSpacingInfo ) {
        if( newWireSpacingInfo != wireSpacingInfo ) {
            NotificationChain msgs = null;
            if( wireSpacingInfo != null ) msgs = ( ( InternalEObject ) wireSpacingInfo ).eInverseRemove( this,
                    CimPackage.WIRE_SPACING__WIRE_POSITIONS, WireSpacing.class, msgs );
            if( newWireSpacingInfo != null ) msgs = ( ( InternalEObject ) newWireSpacingInfo ).eInverseAdd( this,
                    CimPackage.WIRE_SPACING__WIRE_POSITIONS, WireSpacing.class, msgs );
            msgs = basicSetWireSpacingInfo( newWireSpacingInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
            wireSpacingInfoESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_POSITION__WIRE_SPACING_INFO,
                        newWireSpacingInfo, newWireSpacingInfo, !oldWireSpacingInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWireSpacingInfo( NotificationChain msgs ) {
        WireSpacing oldWireSpacingInfo = wireSpacingInfo;
        wireSpacingInfo = null;
        boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
        wireSpacingInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_POSITION__WIRE_SPACING_INFO, oldWireSpacingInfo, null, oldWireSpacingInfoESet );
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
    public void unsetWireSpacingInfo() {
        if( wireSpacingInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) wireSpacingInfo ).eInverseRemove( this,
                    CimPackage.WIRE_SPACING__WIRE_POSITIONS, WireSpacing.class, msgs );
            msgs = basicUnsetWireSpacingInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWireSpacingInfoESet = wireSpacingInfoESet;
            wireSpacingInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIRE_POSITION__WIRE_SPACING_INFO, null, null, oldWireSpacingInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWireSpacingInfo() {
        return wireSpacingInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WirePhaseInfo > getWirePhaseInfo() {
        if( wirePhaseInfo == null ) {
            wirePhaseInfo = new EObjectWithInverseResolvingEList.Unsettable< WirePhaseInfo >( WirePhaseInfo.class, this,
                    CimPackage.WIRE_POSITION__WIRE_PHASE_INFO, CimPackage.WIRE_PHASE_INFO__WIRE_POSITION );
        }
        return wirePhaseInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWirePhaseInfo() {
        if( wirePhaseInfo != null ) ( ( InternalEList.Unsettable< ? > ) wirePhaseInfo ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWirePhaseInfo() {
        return wirePhaseInfo != null && ( ( InternalEList.Unsettable< ? > ) wirePhaseInfo ).isSet();
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
        case CimPackage.WIRE_POSITION__WIRE_SPACING_INFO:
            if( wireSpacingInfo != null ) msgs = ( ( InternalEObject ) wireSpacingInfo ).eInverseRemove( this,
                    CimPackage.WIRE_SPACING__WIRE_POSITIONS, WireSpacing.class, msgs );
            return basicSetWireSpacingInfo( ( WireSpacing ) otherEnd, msgs );
        case CimPackage.WIRE_POSITION__WIRE_PHASE_INFO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWirePhaseInfo() )
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
        case CimPackage.WIRE_POSITION__WIRE_SPACING_INFO:
            return basicUnsetWireSpacingInfo( msgs );
        case CimPackage.WIRE_POSITION__WIRE_PHASE_INFO:
            return ( ( InternalEList< ? > ) getWirePhaseInfo() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIRE_POSITION__XCOORD:
            return getXCoord();
        case CimPackage.WIRE_POSITION__YCOORD:
            return getYCoord();
        case CimPackage.WIRE_POSITION__WIRE_SPACING_INFO:
            return getWireSpacingInfo();
        case CimPackage.WIRE_POSITION__WIRE_PHASE_INFO:
            return getWirePhaseInfo();
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
        case CimPackage.WIRE_POSITION__XCOORD:
            setXCoord( ( Float ) newValue );
            return;
        case CimPackage.WIRE_POSITION__YCOORD:
            setYCoord( ( Float ) newValue );
            return;
        case CimPackage.WIRE_POSITION__WIRE_SPACING_INFO:
            setWireSpacingInfo( ( WireSpacing ) newValue );
            return;
        case CimPackage.WIRE_POSITION__WIRE_PHASE_INFO:
            getWirePhaseInfo().clear();
            getWirePhaseInfo().addAll( ( Collection< ? extends WirePhaseInfo > ) newValue );
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
        case CimPackage.WIRE_POSITION__XCOORD:
            unsetXCoord();
            return;
        case CimPackage.WIRE_POSITION__YCOORD:
            unsetYCoord();
            return;
        case CimPackage.WIRE_POSITION__WIRE_SPACING_INFO:
            unsetWireSpacingInfo();
            return;
        case CimPackage.WIRE_POSITION__WIRE_PHASE_INFO:
            unsetWirePhaseInfo();
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
        case CimPackage.WIRE_POSITION__XCOORD:
            return isSetXCoord();
        case CimPackage.WIRE_POSITION__YCOORD:
            return isSetYCoord();
        case CimPackage.WIRE_POSITION__WIRE_SPACING_INFO:
            return isSetWireSpacingInfo();
        case CimPackage.WIRE_POSITION__WIRE_PHASE_INFO:
            return isSetWirePhaseInfo();
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
        result.append( " (xCoord: " );
        if( xCoordESet )
            result.append( xCoord );
        else
            result.append( "<unset>" );
        result.append( ", yCoord: " );
        if( yCoordESet )
            result.append( yCoord );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WirePositionImpl
