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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergyAreaImpl#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyAreaImpl extends IdentifiedObjectImpl implements EnergyArea {
    /**
     * The cached value of the '{@link #getControlArea() <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlArea()
     * @generated
     * @ordered
     */
    protected ControlArea controlArea;

    /**
     * This is true if the Control Area reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlAreaESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnergyAreaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEnergyArea();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlArea getControlArea() {
        if( controlArea != null && controlArea.eIsProxy() ) {
            InternalEObject oldControlArea = ( InternalEObject ) controlArea;
            controlArea = ( ControlArea ) eResolveProxy( oldControlArea );
            if( controlArea != oldControlArea ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.ENERGY_AREA__CONTROL_AREA, oldControlArea, controlArea ) );
            }
        }
        return controlArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlArea basicGetControlArea() {
        return controlArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetControlArea( ControlArea newControlArea, NotificationChain msgs ) {
        ControlArea oldControlArea = controlArea;
        controlArea = newControlArea;
        boolean oldControlAreaESet = controlAreaESet;
        controlAreaESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_AREA__CONTROL_AREA, oldControlArea, newControlArea, !oldControlAreaESet );
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
    public void setControlArea( ControlArea newControlArea ) {
        if( newControlArea != controlArea ) {
            NotificationChain msgs = null;
            if( controlArea != null ) msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this,
                    CimPackage.CONTROL_AREA__ENERGY_AREA, ControlArea.class, msgs );
            if( newControlArea != null ) msgs = ( ( InternalEObject ) newControlArea ).eInverseAdd( this,
                    CimPackage.CONTROL_AREA__ENERGY_AREA, ControlArea.class, msgs );
            msgs = basicSetControlArea( newControlArea, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaESet = controlAreaESet;
            controlAreaESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_AREA__CONTROL_AREA, newControlArea, newControlArea, !oldControlAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetControlArea( NotificationChain msgs ) {
        ControlArea oldControlArea = controlArea;
        controlArea = null;
        boolean oldControlAreaESet = controlAreaESet;
        controlAreaESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_AREA__CONTROL_AREA, oldControlArea, null, oldControlAreaESet );
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
    public void unsetControlArea() {
        if( controlArea != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this, CimPackage.CONTROL_AREA__ENERGY_AREA,
                    ControlArea.class, msgs );
            msgs = basicUnsetControlArea( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaESet = controlAreaESet;
            controlAreaESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_AREA__CONTROL_AREA, null, null, oldControlAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlArea() {
        return controlAreaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ENERGY_AREA__CONTROL_AREA:
            if( controlArea != null ) msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this,
                    CimPackage.CONTROL_AREA__ENERGY_AREA, ControlArea.class, msgs );
            return basicSetControlArea( ( ControlArea ) otherEnd, msgs );
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
        case CimPackage.ENERGY_AREA__CONTROL_AREA:
            return basicUnsetControlArea( msgs );
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
        case CimPackage.ENERGY_AREA__CONTROL_AREA:
            if( resolve ) return getControlArea();
            return basicGetControlArea();
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
        case CimPackage.ENERGY_AREA__CONTROL_AREA:
            setControlArea( ( ControlArea ) newValue );
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
        case CimPackage.ENERGY_AREA__CONTROL_AREA:
            unsetControlArea();
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
        case CimPackage.ENERGY_AREA__CONTROL_AREA:
            return isSetControlArea();
        }
        return super.eIsSet( featureID );
    }

} //EnergyAreaImpl
