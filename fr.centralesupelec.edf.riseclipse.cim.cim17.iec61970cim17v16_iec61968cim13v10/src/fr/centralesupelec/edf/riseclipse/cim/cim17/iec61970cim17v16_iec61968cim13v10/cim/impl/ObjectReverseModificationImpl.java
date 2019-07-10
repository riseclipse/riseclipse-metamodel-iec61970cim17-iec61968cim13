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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectModification;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectReverseModification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Reverse Modification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ObjectReverseModificationImpl#getObjectModification <em>Object Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectReverseModificationImpl extends ChangeSetMemberImpl implements ObjectReverseModification {
    /**
     * The cached value of the '{@link #getObjectModification() <em>Object Modification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectModification()
     * @generated
     * @ordered
     */
    protected ObjectModification objectModification;

    /**
     * This is true if the Object Modification reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean objectModificationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObjectReverseModificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getObjectReverseModification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ObjectModification getObjectModification() {
        return objectModification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObjectModification( ObjectModification newObjectModification,
            NotificationChain msgs ) {
        ObjectModification oldObjectModification = objectModification;
        objectModification = newObjectModification;
        boolean oldObjectModificationESet = objectModificationESet;
        objectModificationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, oldObjectModification,
                    newObjectModification, !oldObjectModificationESet );
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
    public void setObjectModification( ObjectModification newObjectModification ) {
        if( newObjectModification != objectModification ) {
            NotificationChain msgs = null;
            if( objectModification != null ) msgs = ( ( InternalEObject ) objectModification ).eInverseRemove( this,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, ObjectModification.class, msgs );
            if( newObjectModification != null ) msgs = ( ( InternalEObject ) newObjectModification ).eInverseAdd( this,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, ObjectModification.class, msgs );
            msgs = basicSetObjectModification( newObjectModification, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldObjectModificationESet = objectModificationESet;
            objectModificationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, newObjectModification,
                    newObjectModification, !oldObjectModificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetObjectModification( NotificationChain msgs ) {
        ObjectModification oldObjectModification = objectModification;
        objectModification = null;
        boolean oldObjectModificationESet = objectModificationESet;
        objectModificationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, oldObjectModification, null,
                    oldObjectModificationESet );
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
    public void unsetObjectModification() {
        if( objectModification != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) objectModification ).eInverseRemove( this,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, ObjectModification.class, msgs );
            msgs = basicUnsetObjectModification( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldObjectModificationESet = objectModificationESet;
            objectModificationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, null, null,
                    oldObjectModificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetObjectModification() {
        return objectModificationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION:
            if( objectModification != null ) msgs = ( ( InternalEObject ) objectModification ).eInverseRemove( this,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, ObjectModification.class, msgs );
            return basicSetObjectModification( ( ObjectModification ) otherEnd, msgs );
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
        case CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION:
            return basicUnsetObjectModification( msgs );
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
        case CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION:
            return getObjectModification();
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
        case CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION:
            setObjectModification( ( ObjectModification ) newValue );
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
        case CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION:
            unsetObjectModification();
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
        case CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION:
            return isSetObjectModification();
        }
        return super.eIsSet( featureID );
    }

} //ObjectReverseModificationImpl
