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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DataSetMemberImpl#getTargetObject <em>Target Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DataSetMemberImpl#getPropertiesObject <em>Properties Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetMemberImpl extends IdentifiedObjectImpl implements DataSetMember {
    /**
     * The cached value of the '{@link #getTargetObject() <em>Target Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetObject()
     * @generated
     * @ordered
     */
    protected IdentifiedObject targetObject;

    /**
     * This is true if the Target Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetObjectESet;

    /**
     * The cached value of the '{@link #getPropertiesObject() <em>Properties Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertiesObject()
     * @generated
     * @ordered
     */
    protected IdentifiedObject propertiesObject;

    /**
     * This is true if the Properties Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean propertiesObjectESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataSetMemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDataSetMember();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IdentifiedObject getTargetObject() {
        return targetObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTargetObject( IdentifiedObject newTargetObject, NotificationChain msgs ) {
        IdentifiedObject oldTargetObject = targetObject;
        targetObject = newTargetObject;
        boolean oldTargetObjectESet = targetObjectESet;
        targetObjectESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DATA_SET_MEMBER__TARGET_OBJECT, oldTargetObject, newTargetObject, !oldTargetObjectESet );
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
    public void setTargetObject( IdentifiedObject newTargetObject ) {
        if( newTargetObject != targetObject ) {
            NotificationChain msgs = null;
            if( targetObject != null ) msgs = ( ( InternalEObject ) targetObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            if( newTargetObject != null ) msgs = ( ( InternalEObject ) newTargetObject ).eInverseAdd( this,
                    CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            msgs = basicSetTargetObject( newTargetObject, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTargetObjectESet = targetObjectESet;
            targetObjectESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DATA_SET_MEMBER__TARGET_OBJECT,
                        newTargetObject, newTargetObject, !oldTargetObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTargetObject( NotificationChain msgs ) {
        IdentifiedObject oldTargetObject = targetObject;
        targetObject = null;
        boolean oldTargetObjectESet = targetObjectESet;
        targetObjectESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DATA_SET_MEMBER__TARGET_OBJECT, oldTargetObject, null, oldTargetObjectESet );
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
    public void unsetTargetObject() {
        if( targetObject != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) targetObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            msgs = basicUnsetTargetObject( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTargetObjectESet = targetObjectESet;
            targetObjectESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DATA_SET_MEMBER__TARGET_OBJECT, null, null, oldTargetObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetObject() {
        return targetObjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IdentifiedObject getPropertiesObject() {
        return propertiesObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPropertiesObject( IdentifiedObject newPropertiesObject, NotificationChain msgs ) {
        IdentifiedObject oldPropertiesObject = propertiesObject;
        propertiesObject = newPropertiesObject;
        boolean oldPropertiesObjectESet = propertiesObjectESet;
        propertiesObjectESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT, oldPropertiesObject, newPropertiesObject,
                    !oldPropertiesObjectESet );
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
    public void setPropertiesObject( IdentifiedObject newPropertiesObject ) {
        if( newPropertiesObject != propertiesObject ) {
            NotificationChain msgs = null;
            if( propertiesObject != null ) msgs = ( ( InternalEObject ) propertiesObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            if( newPropertiesObject != null ) msgs = ( ( InternalEObject ) newPropertiesObject ).eInverseAdd( this,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            msgs = basicSetPropertiesObject( newPropertiesObject, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPropertiesObjectESet = propertiesObjectESet;
            propertiesObjectESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT,
                        newPropertiesObject, newPropertiesObject, !oldPropertiesObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPropertiesObject( NotificationChain msgs ) {
        IdentifiedObject oldPropertiesObject = propertiesObject;
        propertiesObject = null;
        boolean oldPropertiesObjectESet = propertiesObjectESet;
        propertiesObjectESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT, oldPropertiesObject, null, oldPropertiesObjectESet );
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
    public void unsetPropertiesObject() {
        if( propertiesObject != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) propertiesObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            msgs = basicUnsetPropertiesObject( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPropertiesObjectESet = propertiesObjectESet;
            propertiesObjectESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT, null, null, oldPropertiesObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPropertiesObject() {
        return propertiesObjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DATA_SET_MEMBER__TARGET_OBJECT:
            if( targetObject != null ) msgs = ( ( InternalEObject ) targetObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            return basicSetTargetObject( ( IdentifiedObject ) otherEnd, msgs );
        case CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT:
            if( propertiesObject != null ) msgs = ( ( InternalEObject ) propertiesObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, IdentifiedObject.class, msgs );
            return basicSetPropertiesObject( ( IdentifiedObject ) otherEnd, msgs );
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
        case CimPackage.DATA_SET_MEMBER__TARGET_OBJECT:
            return basicUnsetTargetObject( msgs );
        case CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT:
            return basicUnsetPropertiesObject( msgs );
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
        case CimPackage.DATA_SET_MEMBER__TARGET_OBJECT:
            return getTargetObject();
        case CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT:
            return getPropertiesObject();
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
        case CimPackage.DATA_SET_MEMBER__TARGET_OBJECT:
            setTargetObject( ( IdentifiedObject ) newValue );
            return;
        case CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT:
            setPropertiesObject( ( IdentifiedObject ) newValue );
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
        case CimPackage.DATA_SET_MEMBER__TARGET_OBJECT:
            unsetTargetObject();
            return;
        case CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT:
            unsetPropertiesObject();
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
        case CimPackage.DATA_SET_MEMBER__TARGET_OBJECT:
            return isSetTargetObject();
        case CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT:
            return isSetPropertiesObject();
        }
        return super.eIsSet( featureID );
    }

} //DataSetMemberImpl
