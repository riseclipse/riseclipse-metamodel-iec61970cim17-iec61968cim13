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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contingency Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ContingencyElementImpl#getContingency <em>Contingency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContingencyElementImpl extends IdentifiedObjectImpl implements ContingencyElement {
    /**
     * The cached value of the '{@link #getContingency() <em>Contingency</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContingency()
     * @generated
     * @ordered
     */
    protected Contingency contingency;

    /**
     * This is true if the Contingency reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean contingencyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContingencyElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getContingencyElement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Contingency getContingency() {
        return contingency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContingency( Contingency newContingency, NotificationChain msgs ) {
        Contingency oldContingency = contingency;
        contingency = newContingency;
        boolean oldContingencyESet = contingencyESet;
        contingencyESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY, oldContingency, newContingency, !oldContingencyESet );
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
    public void setContingency( Contingency newContingency ) {
        if( newContingency != contingency ) {
            NotificationChain msgs = null;
            if( contingency != null ) msgs = ( ( InternalEObject ) contingency ).eInverseRemove( this,
                    CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs );
            if( newContingency != null ) msgs = ( ( InternalEObject ) newContingency ).eInverseAdd( this,
                    CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs );
            msgs = basicSetContingency( newContingency, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldContingencyESet = contingencyESet;
            contingencyESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY,
                        newContingency, newContingency, !oldContingencyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetContingency( NotificationChain msgs ) {
        Contingency oldContingency = contingency;
        contingency = null;
        boolean oldContingencyESet = contingencyESet;
        contingencyESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY, oldContingency, null, oldContingencyESet );
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
    public void unsetContingency() {
        if( contingency != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) contingency ).eInverseRemove( this,
                    CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs );
            msgs = basicUnsetContingency( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldContingencyESet = contingencyESet;
            contingencyESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY, null, null, oldContingencyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetContingency() {
        return contingencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
            if( contingency != null ) msgs = ( ( InternalEObject ) contingency ).eInverseRemove( this,
                    CimPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs );
            return basicSetContingency( ( Contingency ) otherEnd, msgs );
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
        case CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
            return basicUnsetContingency( msgs );
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
        case CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
            return getContingency();
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
        case CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
            setContingency( ( Contingency ) newValue );
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
        case CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
            unsetContingency();
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
        case CimPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
            return isSetContingency();
        }
        return super.eIsSet( featureID );
    }

} //ContingencyElementImpl
