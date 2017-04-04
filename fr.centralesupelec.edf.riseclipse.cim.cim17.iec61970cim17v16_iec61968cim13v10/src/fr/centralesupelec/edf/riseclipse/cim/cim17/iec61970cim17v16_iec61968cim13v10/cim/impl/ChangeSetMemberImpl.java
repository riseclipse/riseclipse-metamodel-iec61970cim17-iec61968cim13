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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSetMember;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Set Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ChangeSetMemberImpl#getChangeset <em>Changeset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeSetMemberImpl extends DataSetMemberImpl implements ChangeSetMember {
    /**
     * The cached value of the '{@link #getChangeset() <em>Changeset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangeset()
     * @generated
     * @ordered
     */
    protected ChangeSet changeset;

    /**
     * This is true if the Changeset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changesetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChangeSetMemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getChangeSetMember();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ChangeSet getChangeset() {
        return changeset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangeset( ChangeSet newChangeset, NotificationChain msgs ) {
        ChangeSet oldChangeset = changeset;
        changeset = newChangeset;
        boolean oldChangesetESet = changesetESet;
        changesetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHANGE_SET_MEMBER__CHANGESET, oldChangeset, newChangeset, !oldChangesetESet );
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
    public void setChangeset( ChangeSet newChangeset ) {
        if( newChangeset != changeset ) {
            NotificationChain msgs = null;
            if( changeset != null ) msgs = ( ( InternalEObject ) changeset ).eInverseRemove( this,
                    CimPackage.CHANGE_SET__CHANGE_SET_MEMBER, ChangeSet.class, msgs );
            if( newChangeset != null ) msgs = ( ( InternalEObject ) newChangeset ).eInverseAdd( this,
                    CimPackage.CHANGE_SET__CHANGE_SET_MEMBER, ChangeSet.class, msgs );
            msgs = basicSetChangeset( newChangeset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangesetESet = changesetESet;
            changesetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CHANGE_SET_MEMBER__CHANGESET, newChangeset, newChangeset, !oldChangesetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangeset( NotificationChain msgs ) {
        ChangeSet oldChangeset = changeset;
        changeset = null;
        boolean oldChangesetESet = changesetESet;
        changesetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHANGE_SET_MEMBER__CHANGESET, oldChangeset, null, oldChangesetESet );
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
    public void unsetChangeset() {
        if( changeset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changeset ).eInverseRemove( this, CimPackage.CHANGE_SET__CHANGE_SET_MEMBER,
                    ChangeSet.class, msgs );
            msgs = basicUnsetChangeset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangesetESet = changesetESet;
            changesetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CHANGE_SET_MEMBER__CHANGESET, null, null, oldChangesetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangeset() {
        return changesetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CHANGE_SET_MEMBER__CHANGESET:
            if( changeset != null ) msgs = ( ( InternalEObject ) changeset ).eInverseRemove( this,
                    CimPackage.CHANGE_SET__CHANGE_SET_MEMBER, ChangeSet.class, msgs );
            return basicSetChangeset( ( ChangeSet ) otherEnd, msgs );
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
        case CimPackage.CHANGE_SET_MEMBER__CHANGESET:
            return basicUnsetChangeset( msgs );
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
        case CimPackage.CHANGE_SET_MEMBER__CHANGESET:
            return getChangeset();
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
        case CimPackage.CHANGE_SET_MEMBER__CHANGESET:
            setChangeset( ( ChangeSet ) newValue );
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
        case CimPackage.CHANGE_SET_MEMBER__CHANGESET:
            unsetChangeset();
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
        case CimPackage.CHANGE_SET_MEMBER__CHANGESET:
            return isSetChangeset();
        }
        return super.eIsSet( featureID );
    }

} //ChangeSetMemberImpl
