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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Name;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NameType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NameImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NameImpl#getNameType <em>Name Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NameImpl#getIdentifiedObject <em>Identified Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameImpl extends CimObjectWithIDImpl implements Name {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getNameType() <em>Name Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameType()
     * @generated
     * @ordered
     */
    protected NameType nameType;

    /**
     * This is true if the Name Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameTypeESet;

    /**
     * The cached value of the '{@link #getIdentifiedObject() <em>Identified Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentifiedObject()
     * @generated
     * @ordered
     */
    protected IdentifiedObject identifiedObject;

    /**
     * This is true if the Identified Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean identifiedObjectESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NameImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getName_();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.NAME__NAME, oldName, name, !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NAME__NAME,
                oldName, NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NameType getNameType() {
        return nameType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNameType( NameType newNameType, NotificationChain msgs ) {
        NameType oldNameType = nameType;
        nameType = newNameType;
        boolean oldNameTypeESet = nameTypeESet;
        nameTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.NAME__NAME_TYPE,
                    oldNameType, newNameType, !oldNameTypeESet );
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
    public void setNameType( NameType newNameType ) {
        if( newNameType != nameType ) {
            NotificationChain msgs = null;
            if( nameType != null ) msgs = ( ( InternalEObject ) nameType ).eInverseRemove( this,
                    CimPackage.NAME_TYPE__NAMES, NameType.class, msgs );
            if( newNameType != null ) msgs = ( ( InternalEObject ) newNameType ).eInverseAdd( this,
                    CimPackage.NAME_TYPE__NAMES, NameType.class, msgs );
            msgs = basicSetNameType( newNameType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNameTypeESet = nameTypeESet;
            nameTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.NAME__NAME_TYPE, newNameType, newNameType, !oldNameTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNameType( NotificationChain msgs ) {
        NameType oldNameType = nameType;
        nameType = null;
        boolean oldNameTypeESet = nameTypeESet;
        nameTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NAME__NAME_TYPE, oldNameType, null, oldNameTypeESet );
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
    public void unsetNameType() {
        if( nameType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) nameType ).eInverseRemove( this, CimPackage.NAME_TYPE__NAMES, NameType.class,
                    msgs );
            msgs = basicUnsetNameType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNameTypeESet = nameTypeESet;
            nameTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NAME__NAME_TYPE, null, null, oldNameTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNameType() {
        return nameTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IdentifiedObject getIdentifiedObject() {
        return identifiedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdentifiedObject( IdentifiedObject newIdentifiedObject, NotificationChain msgs ) {
        IdentifiedObject oldIdentifiedObject = identifiedObject;
        identifiedObject = newIdentifiedObject;
        boolean oldIdentifiedObjectESet = identifiedObjectESet;
        identifiedObjectESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.NAME__IDENTIFIED_OBJECT, oldIdentifiedObject, newIdentifiedObject,
                    !oldIdentifiedObjectESet );
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
    public void setIdentifiedObject( IdentifiedObject newIdentifiedObject ) {
        if( newIdentifiedObject != identifiedObject ) {
            NotificationChain msgs = null;
            if( identifiedObject != null ) msgs = ( ( InternalEObject ) identifiedObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__NAMES, IdentifiedObject.class, msgs );
            if( newIdentifiedObject != null ) msgs = ( ( InternalEObject ) newIdentifiedObject ).eInverseAdd( this,
                    CimPackage.IDENTIFIED_OBJECT__NAMES, IdentifiedObject.class, msgs );
            msgs = basicSetIdentifiedObject( newIdentifiedObject, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIdentifiedObjectESet = identifiedObjectESet;
            identifiedObjectESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NAME__IDENTIFIED_OBJECT,
                        newIdentifiedObject, newIdentifiedObject, !oldIdentifiedObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIdentifiedObject( NotificationChain msgs ) {
        IdentifiedObject oldIdentifiedObject = identifiedObject;
        identifiedObject = null;
        boolean oldIdentifiedObjectESet = identifiedObjectESet;
        identifiedObjectESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NAME__IDENTIFIED_OBJECT, oldIdentifiedObject, null, oldIdentifiedObjectESet );
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
    public void unsetIdentifiedObject() {
        if( identifiedObject != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) identifiedObject ).eInverseRemove( this, CimPackage.IDENTIFIED_OBJECT__NAMES,
                    IdentifiedObject.class, msgs );
            msgs = basicUnsetIdentifiedObject( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIdentifiedObjectESet = identifiedObjectESet;
            identifiedObjectESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NAME__IDENTIFIED_OBJECT, null, null, oldIdentifiedObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIdentifiedObject() {
        return identifiedObjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.NAME__NAME_TYPE:
            if( nameType != null ) msgs = ( ( InternalEObject ) nameType ).eInverseRemove( this,
                    CimPackage.NAME_TYPE__NAMES, NameType.class, msgs );
            return basicSetNameType( ( NameType ) otherEnd, msgs );
        case CimPackage.NAME__IDENTIFIED_OBJECT:
            if( identifiedObject != null ) msgs = ( ( InternalEObject ) identifiedObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__NAMES, IdentifiedObject.class, msgs );
            return basicSetIdentifiedObject( ( IdentifiedObject ) otherEnd, msgs );
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
        case CimPackage.NAME__NAME_TYPE:
            return basicUnsetNameType( msgs );
        case CimPackage.NAME__IDENTIFIED_OBJECT:
            return basicUnsetIdentifiedObject( msgs );
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
        case CimPackage.NAME__NAME:
            return getName();
        case CimPackage.NAME__NAME_TYPE:
            return getNameType();
        case CimPackage.NAME__IDENTIFIED_OBJECT:
            return getIdentifiedObject();
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
        case CimPackage.NAME__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.NAME__NAME_TYPE:
            setNameType( ( NameType ) newValue );
            return;
        case CimPackage.NAME__IDENTIFIED_OBJECT:
            setIdentifiedObject( ( IdentifiedObject ) newValue );
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
        case CimPackage.NAME__NAME:
            unsetName();
            return;
        case CimPackage.NAME__NAME_TYPE:
            unsetNameType();
            return;
        case CimPackage.NAME__IDENTIFIED_OBJECT:
            unsetIdentifiedObject();
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
        case CimPackage.NAME__NAME:
            return isSetName();
        case CimPackage.NAME__NAME_TYPE:
            return isSetNameType();
        case CimPackage.NAME__IDENTIFIED_OBJECT:
            return isSetIdentifiedObject();
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
        result.append( " (name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //NameImpl
