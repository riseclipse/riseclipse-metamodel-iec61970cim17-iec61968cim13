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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PrimeMover;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine;

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
 * An implementation of the model object '<em><b>Prime Mover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PrimeMoverImpl#getPrimeMoverRating <em>Prime Mover Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PrimeMoverImpl#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimeMoverImpl extends PowerSystemResourceImpl implements PrimeMover {
    /**
     * The default value of the '{@link #getPrimeMoverRating() <em>Prime Mover Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimeMoverRating()
     * @generated
     * @ordered
     */
    protected static final Float PRIME_MOVER_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrimeMoverRating() <em>Prime Mover Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimeMoverRating()
     * @generated
     * @ordered
     */
    protected Float primeMoverRating = PRIME_MOVER_RATING_EDEFAULT;

    /**
     * This is true if the Prime Mover Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean primeMoverRatingESet;

    /**
     * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachines()
     * @generated
     * @ordered
     */
    protected EList< SynchronousMachine > synchronousMachines;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrimeMoverImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPrimeMover();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPrimeMoverRating() {
        return primeMoverRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrimeMoverRating( Float newPrimeMoverRating ) {
        Float oldPrimeMoverRating = primeMoverRating;
        primeMoverRating = newPrimeMoverRating;
        boolean oldPrimeMoverRatingESet = primeMoverRatingESet;
        primeMoverRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRIME_MOVER__PRIME_MOVER_RATING,
                    oldPrimeMoverRating, primeMoverRating, !oldPrimeMoverRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrimeMoverRating() {
        Float oldPrimeMoverRating = primeMoverRating;
        boolean oldPrimeMoverRatingESet = primeMoverRatingESet;
        primeMoverRating = PRIME_MOVER_RATING_EDEFAULT;
        primeMoverRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRIME_MOVER__PRIME_MOVER_RATING,
                    oldPrimeMoverRating, PRIME_MOVER_RATING_EDEFAULT, oldPrimeMoverRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrimeMoverRating() {
        return primeMoverRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SynchronousMachine > getSynchronousMachines() {
        if( synchronousMachines == null ) {
            synchronousMachines = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< SynchronousMachine >(
                    SynchronousMachine.class, this, CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES,
                    CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS );
        }
        return synchronousMachines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSynchronousMachines() {
        if( synchronousMachines != null ) ( ( InternalEList.Unsettable< ? > ) synchronousMachines ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachines() {
        return synchronousMachines != null && ( ( InternalEList.Unsettable< ? > ) synchronousMachines ).isSet();
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
        case CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSynchronousMachines() )
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
        case CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< ? > ) getSynchronousMachines() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PRIME_MOVER__PRIME_MOVER_RATING:
            return getPrimeMoverRating();
        case CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
            return getSynchronousMachines();
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
        case CimPackage.PRIME_MOVER__PRIME_MOVER_RATING:
            setPrimeMoverRating( ( Float ) newValue );
            return;
        case CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
            getSynchronousMachines().clear();
            getSynchronousMachines().addAll( ( Collection< ? extends SynchronousMachine > ) newValue );
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
        case CimPackage.PRIME_MOVER__PRIME_MOVER_RATING:
            unsetPrimeMoverRating();
            return;
        case CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
            unsetSynchronousMachines();
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
        case CimPackage.PRIME_MOVER__PRIME_MOVER_RATING:
            return isSetPrimeMoverRating();
        case CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
            return isSetSynchronousMachines();
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
        result.append( " (primeMoverRating: " );
        if( primeMoverRatingESet )
            result.append( primeMoverRating );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PrimeMoverImpl
