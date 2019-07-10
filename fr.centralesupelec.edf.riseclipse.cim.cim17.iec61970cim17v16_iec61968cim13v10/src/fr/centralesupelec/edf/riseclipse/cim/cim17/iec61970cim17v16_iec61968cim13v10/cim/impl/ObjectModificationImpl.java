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
 * An implementation of the model object '<em><b>Object Modification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ObjectModificationImpl#getObjectReverseModification <em>Object Reverse Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectModificationImpl extends ChangeSetMemberImpl implements ObjectModification {
    /**
     * The cached value of the '{@link #getObjectReverseModification() <em>Object Reverse Modification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectReverseModification()
     * @generated
     * @ordered
     */
    protected ObjectReverseModification objectReverseModification;

    /**
     * This is true if the Object Reverse Modification reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean objectReverseModificationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObjectModificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getObjectModification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ObjectReverseModification getObjectReverseModification() {
        if( objectReverseModification != null && objectReverseModification.eIsProxy() ) {
            InternalEObject oldObjectReverseModification = ( InternalEObject ) objectReverseModification;
            objectReverseModification = ( ObjectReverseModification ) eResolveProxy( oldObjectReverseModification );
            if( objectReverseModification != oldObjectReverseModification ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, oldObjectReverseModification,
                        objectReverseModification ) );
            }
        }
        return objectReverseModification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectReverseModification basicGetObjectReverseModification() {
        return objectReverseModification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObjectReverseModification( ObjectReverseModification newObjectReverseModification,
            NotificationChain msgs ) {
        ObjectReverseModification oldObjectReverseModification = objectReverseModification;
        objectReverseModification = newObjectReverseModification;
        boolean oldObjectReverseModificationESet = objectReverseModificationESet;
        objectReverseModificationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, oldObjectReverseModification,
                    newObjectReverseModification, !oldObjectReverseModificationESet );
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
    public void setObjectReverseModification( ObjectReverseModification newObjectReverseModification ) {
        if( newObjectReverseModification != objectReverseModification ) {
            NotificationChain msgs = null;
            if( objectReverseModification != null )
                msgs = ( ( InternalEObject ) objectReverseModification ).eInverseRemove( this,
                        CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, ObjectReverseModification.class,
                        msgs );
            if( newObjectReverseModification != null )
                msgs = ( ( InternalEObject ) newObjectReverseModification ).eInverseAdd( this,
                        CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, ObjectReverseModification.class,
                        msgs );
            msgs = basicSetObjectReverseModification( newObjectReverseModification, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldObjectReverseModificationESet = objectReverseModificationESet;
            objectReverseModificationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, newObjectReverseModification,
                    newObjectReverseModification, !oldObjectReverseModificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetObjectReverseModification( NotificationChain msgs ) {
        ObjectReverseModification oldObjectReverseModification = objectReverseModification;
        objectReverseModification = null;
        boolean oldObjectReverseModificationESet = objectReverseModificationESet;
        objectReverseModificationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, oldObjectReverseModification, null,
                    oldObjectReverseModificationESet );
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
    public void unsetObjectReverseModification() {
        if( objectReverseModification != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) objectReverseModification ).eInverseRemove( this,
                    CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, ObjectReverseModification.class,
                    msgs );
            msgs = basicUnsetObjectReverseModification( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldObjectReverseModificationESet = objectReverseModificationESet;
            objectReverseModificationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION, null, null,
                    oldObjectReverseModificationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetObjectReverseModification() {
        return objectReverseModificationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION:
            if( objectReverseModification != null )
                msgs = ( ( InternalEObject ) objectReverseModification ).eInverseRemove( this,
                        CimPackage.OBJECT_REVERSE_MODIFICATION__OBJECT_MODIFICATION, ObjectReverseModification.class,
                        msgs );
            return basicSetObjectReverseModification( ( ObjectReverseModification ) otherEnd, msgs );
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
        case CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION:
            return basicUnsetObjectReverseModification( msgs );
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
        case CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION:
            if( resolve ) return getObjectReverseModification();
            return basicGetObjectReverseModification();
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
        case CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION:
            setObjectReverseModification( ( ObjectReverseModification ) newValue );
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
        case CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION:
            unsetObjectReverseModification();
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
        case CimPackage.OBJECT_MODIFICATION__OBJECT_REVERSE_MODIFICATION:
            return isSetObjectReverseModification();
        }
        return super.eIsSet( featureID );
    }

} //ObjectModificationImpl
