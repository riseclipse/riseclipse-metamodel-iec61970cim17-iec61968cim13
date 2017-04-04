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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentNetwork;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentEquipmentImpl#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentEquipmentImpl extends ConductingEquipmentImpl implements EquivalentEquipment {
    /**
     * The cached value of the '{@link #getEquivalentNetwork() <em>Equivalent Network</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquivalentNetwork()
     * @generated
     * @ordered
     */
    protected EquivalentNetwork equivalentNetwork;

    /**
     * This is true if the Equivalent Network reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean equivalentNetworkESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquivalentEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEquivalentEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquivalentNetwork getEquivalentNetwork() {
        return equivalentNetwork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEquivalentNetwork( EquivalentNetwork newEquivalentNetwork,
            NotificationChain msgs ) {
        EquivalentNetwork oldEquivalentNetwork = equivalentNetwork;
        equivalentNetwork = newEquivalentNetwork;
        boolean oldEquivalentNetworkESet = equivalentNetworkESet;
        equivalentNetworkESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK, oldEquivalentNetwork, newEquivalentNetwork,
                    !oldEquivalentNetworkESet );
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
    public void setEquivalentNetwork( EquivalentNetwork newEquivalentNetwork ) {
        if( newEquivalentNetwork != equivalentNetwork ) {
            NotificationChain msgs = null;
            if( equivalentNetwork != null ) msgs = ( ( InternalEObject ) equivalentNetwork ).eInverseRemove( this,
                    CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs );
            if( newEquivalentNetwork != null ) msgs = ( ( InternalEObject ) newEquivalentNetwork ).eInverseAdd( this,
                    CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs );
            msgs = basicSetEquivalentNetwork( newEquivalentNetwork, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquivalentNetworkESet = equivalentNetworkESet;
            equivalentNetworkESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK,
                            newEquivalentNetwork, newEquivalentNetwork, !oldEquivalentNetworkESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEquivalentNetwork( NotificationChain msgs ) {
        EquivalentNetwork oldEquivalentNetwork = equivalentNetwork;
        equivalentNetwork = null;
        boolean oldEquivalentNetworkESet = equivalentNetworkESet;
        equivalentNetworkESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK, oldEquivalentNetwork, null,
                    oldEquivalentNetworkESet );
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
    public void unsetEquivalentNetwork() {
        if( equivalentNetwork != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) equivalentNetwork ).eInverseRemove( this,
                    CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs );
            msgs = basicUnsetEquivalentNetwork( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquivalentNetworkESet = equivalentNetworkESet;
            equivalentNetworkESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK, null, null, oldEquivalentNetworkESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquivalentNetwork() {
        return equivalentNetworkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
            if( equivalentNetwork != null ) msgs = ( ( InternalEObject ) equivalentNetwork ).eInverseRemove( this,
                    CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs );
            return basicSetEquivalentNetwork( ( EquivalentNetwork ) otherEnd, msgs );
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
        case CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
            return basicUnsetEquivalentNetwork( msgs );
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
        case CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
            return getEquivalentNetwork();
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
        case CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
            setEquivalentNetwork( ( EquivalentNetwork ) newValue );
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
        case CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
            unsetEquivalentNetwork();
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
        case CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
            return isSetEquivalentNetwork();
        }
        return super.eIsSet( featureID );
    }

} //EquivalentEquipmentImpl
