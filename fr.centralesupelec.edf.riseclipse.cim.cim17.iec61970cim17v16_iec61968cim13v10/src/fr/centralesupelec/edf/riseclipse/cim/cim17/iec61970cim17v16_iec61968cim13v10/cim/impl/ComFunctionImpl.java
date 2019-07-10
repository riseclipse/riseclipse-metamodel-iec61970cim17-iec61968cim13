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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComDirectionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComModule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ComTechnologyKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComFunctionImpl#getAmrAddress <em>Amr Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComFunctionImpl#getAmrRouter <em>Amr Router</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComFunctionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComFunctionImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ComFunctionImpl#getComModule <em>Com Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComFunctionImpl extends EndDeviceFunctionImpl implements ComFunction {
    /**
     * The default value of the '{@link #getAmrAddress() <em>Amr Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrAddress()
     * @generated
     * @ordered
     */
    protected static final String AMR_ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmrAddress() <em>Amr Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrAddress()
     * @generated
     * @ordered
     */
    protected String amrAddress = AMR_ADDRESS_EDEFAULT;

    /**
     * This is true if the Amr Address attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean amrAddressESet;

    /**
     * The default value of the '{@link #getAmrRouter() <em>Amr Router</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrRouter()
     * @generated
     * @ordered
     */
    protected static final String AMR_ROUTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAmrRouter() <em>Amr Router</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmrRouter()
     * @generated
     * @ordered
     */
    protected String amrRouter = AMR_ROUTER_EDEFAULT;

    /**
     * This is true if the Amr Router attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean amrRouterESet;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final ComDirectionKind DIRECTION_EDEFAULT = ComDirectionKind.FROM_DEVICE;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected ComDirectionKind direction = DIRECTION_EDEFAULT;

    /**
     * This is true if the Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directionESet;

    /**
     * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTechnology()
     * @generated
     * @ordered
     */
    protected static final ComTechnologyKind TECHNOLOGY_EDEFAULT = ComTechnologyKind.CELLULAR;

    /**
     * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTechnology()
     * @generated
     * @ordered
     */
    protected ComTechnologyKind technology = TECHNOLOGY_EDEFAULT;

    /**
     * This is true if the Technology attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean technologyESet;

    /**
     * The cached value of the '{@link #getComModule() <em>Com Module</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComModule()
     * @generated
     * @ordered
     */
    protected ComModule comModule;

    /**
     * This is true if the Com Module reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean comModuleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getComFunction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAmrAddress() {
        return amrAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmrAddress( String newAmrAddress ) {
        String oldAmrAddress = amrAddress;
        amrAddress = newAmrAddress;
        boolean oldAmrAddressESet = amrAddressESet;
        amrAddressESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COM_FUNCTION__AMR_ADDRESS, oldAmrAddress, amrAddress, !oldAmrAddressESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmrAddress() {
        String oldAmrAddress = amrAddress;
        boolean oldAmrAddressESet = amrAddressESet;
        amrAddress = AMR_ADDRESS_EDEFAULT;
        amrAddressESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COM_FUNCTION__AMR_ADDRESS, oldAmrAddress, AMR_ADDRESS_EDEFAULT, oldAmrAddressESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmrAddress() {
        return amrAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAmrRouter() {
        return amrRouter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmrRouter( String newAmrRouter ) {
        String oldAmrRouter = amrRouter;
        amrRouter = newAmrRouter;
        boolean oldAmrRouterESet = amrRouterESet;
        amrRouterESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COM_FUNCTION__AMR_ROUTER, oldAmrRouter, amrRouter, !oldAmrRouterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmrRouter() {
        String oldAmrRouter = amrRouter;
        boolean oldAmrRouterESet = amrRouterESet;
        amrRouter = AMR_ROUTER_EDEFAULT;
        amrRouterESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COM_FUNCTION__AMR_ROUTER, oldAmrRouter, AMR_ROUTER_EDEFAULT, oldAmrRouterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmrRouter() {
        return amrRouterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComDirectionKind getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDirection( ComDirectionKind newDirection ) {
        ComDirectionKind oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        boolean oldDirectionESet = directionESet;
        directionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COM_FUNCTION__DIRECTION, oldDirection, direction, !oldDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDirection() {
        ComDirectionKind oldDirection = direction;
        boolean oldDirectionESet = directionESet;
        direction = DIRECTION_EDEFAULT;
        directionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COM_FUNCTION__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDirection() {
        return directionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComTechnologyKind getTechnology() {
        return technology;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTechnology( ComTechnologyKind newTechnology ) {
        ComTechnologyKind oldTechnology = technology;
        technology = newTechnology == null ? TECHNOLOGY_EDEFAULT : newTechnology;
        boolean oldTechnologyESet = technologyESet;
        technologyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COM_FUNCTION__TECHNOLOGY, oldTechnology, technology, !oldTechnologyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTechnology() {
        ComTechnologyKind oldTechnology = technology;
        boolean oldTechnologyESet = technologyESet;
        technology = TECHNOLOGY_EDEFAULT;
        technologyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COM_FUNCTION__TECHNOLOGY, oldTechnology, TECHNOLOGY_EDEFAULT, oldTechnologyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTechnology() {
        return technologyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComModule getComModule() {
        return comModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComModule( ComModule newComModule, NotificationChain msgs ) {
        ComModule oldComModule = comModule;
        comModule = newComModule;
        boolean oldComModuleESet = comModuleESet;
        comModuleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.COM_FUNCTION__COM_MODULE, oldComModule, newComModule, !oldComModuleESet );
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
    public void setComModule( ComModule newComModule ) {
        if( newComModule != comModule ) {
            NotificationChain msgs = null;
            if( comModule != null ) msgs = ( ( InternalEObject ) comModule ).eInverseRemove( this,
                    CimPackage.COM_MODULE__COM_FUNCTIONS, ComModule.class, msgs );
            if( newComModule != null ) msgs = ( ( InternalEObject ) newComModule ).eInverseAdd( this,
                    CimPackage.COM_MODULE__COM_FUNCTIONS, ComModule.class, msgs );
            msgs = basicSetComModule( newComModule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldComModuleESet = comModuleESet;
            comModuleESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.COM_FUNCTION__COM_MODULE, newComModule, newComModule, !oldComModuleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetComModule( NotificationChain msgs ) {
        ComModule oldComModule = comModule;
        comModule = null;
        boolean oldComModuleESet = comModuleESet;
        comModuleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COM_FUNCTION__COM_MODULE, oldComModule, null, oldComModuleESet );
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
    public void unsetComModule() {
        if( comModule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) comModule ).eInverseRemove( this, CimPackage.COM_MODULE__COM_FUNCTIONS,
                    ComModule.class, msgs );
            msgs = basicUnsetComModule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldComModuleESet = comModuleESet;
            comModuleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COM_FUNCTION__COM_MODULE, null, null, oldComModuleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetComModule() {
        return comModuleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.COM_FUNCTION__COM_MODULE:
            if( comModule != null ) msgs = ( ( InternalEObject ) comModule ).eInverseRemove( this,
                    CimPackage.COM_MODULE__COM_FUNCTIONS, ComModule.class, msgs );
            return basicSetComModule( ( ComModule ) otherEnd, msgs );
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
        case CimPackage.COM_FUNCTION__COM_MODULE:
            return basicUnsetComModule( msgs );
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
        case CimPackage.COM_FUNCTION__AMR_ADDRESS:
            return getAmrAddress();
        case CimPackage.COM_FUNCTION__AMR_ROUTER:
            return getAmrRouter();
        case CimPackage.COM_FUNCTION__DIRECTION:
            return getDirection();
        case CimPackage.COM_FUNCTION__TECHNOLOGY:
            return getTechnology();
        case CimPackage.COM_FUNCTION__COM_MODULE:
            return getComModule();
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
        case CimPackage.COM_FUNCTION__AMR_ADDRESS:
            setAmrAddress( ( String ) newValue );
            return;
        case CimPackage.COM_FUNCTION__AMR_ROUTER:
            setAmrRouter( ( String ) newValue );
            return;
        case CimPackage.COM_FUNCTION__DIRECTION:
            setDirection( ( ComDirectionKind ) newValue );
            return;
        case CimPackage.COM_FUNCTION__TECHNOLOGY:
            setTechnology( ( ComTechnologyKind ) newValue );
            return;
        case CimPackage.COM_FUNCTION__COM_MODULE:
            setComModule( ( ComModule ) newValue );
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
        case CimPackage.COM_FUNCTION__AMR_ADDRESS:
            unsetAmrAddress();
            return;
        case CimPackage.COM_FUNCTION__AMR_ROUTER:
            unsetAmrRouter();
            return;
        case CimPackage.COM_FUNCTION__DIRECTION:
            unsetDirection();
            return;
        case CimPackage.COM_FUNCTION__TECHNOLOGY:
            unsetTechnology();
            return;
        case CimPackage.COM_FUNCTION__COM_MODULE:
            unsetComModule();
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
        case CimPackage.COM_FUNCTION__AMR_ADDRESS:
            return isSetAmrAddress();
        case CimPackage.COM_FUNCTION__AMR_ROUTER:
            return isSetAmrRouter();
        case CimPackage.COM_FUNCTION__DIRECTION:
            return isSetDirection();
        case CimPackage.COM_FUNCTION__TECHNOLOGY:
            return isSetTechnology();
        case CimPackage.COM_FUNCTION__COM_MODULE:
            return isSetComModule();
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
        result.append( " (amrAddress: " );
        if( amrAddressESet )
            result.append( amrAddress );
        else
            result.append( "<unset>" );
        result.append( ", amrRouter: " );
        if( amrRouterESet )
            result.append( amrRouter );
        else
            result.append( "<unset>" );
        result.append( ", direction: " );
        if( directionESet )
            result.append( direction );
        else
            result.append( "<unset>" );
        result.append( ", technology: " );
        if( technologyESet )
            result.append( technology );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ComFunctionImpl
