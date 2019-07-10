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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Name;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NameType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NameTypeAuthority;

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
 * An implementation of the model object '<em><b>Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NameTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NameTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NameTypeImpl#getNameTypeAuthority <em>Name Type Authority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NameTypeImpl#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameTypeImpl extends CimObjectWithIDImpl implements NameType {
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * This is true if the Description attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descriptionESet;

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
     * The cached value of the '{@link #getNameTypeAuthority() <em>Name Type Authority</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNameTypeAuthority()
     * @generated
     * @ordered
     */
    protected NameTypeAuthority nameTypeAuthority;

    /**
     * This is true if the Name Type Authority reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameTypeAuthorityESet;

    /**
     * The cached value of the '{@link #getNames() <em>Names</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNames()
     * @generated
     * @ordered
     */
    protected EList< Name > names;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NameTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNameType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription( String newDescription ) {
        String oldDescription = description;
        description = newDescription;
        boolean oldDescriptionESet = descriptionESet;
        descriptionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.NAME_TYPE__DESCRIPTION, oldDescription, description, !oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescription() {
        String oldDescription = description;
        boolean oldDescriptionESet = descriptionESet;
        description = DESCRIPTION_EDEFAULT;
        descriptionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.NAME_TYPE__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescription() {
        return descriptionESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.NAME_TYPE__NAME, oldName, name, !oldNameESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.NAME_TYPE__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
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
    public NameTypeAuthority getNameTypeAuthority() {
        return nameTypeAuthority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNameTypeAuthority( NameTypeAuthority newNameTypeAuthority,
            NotificationChain msgs ) {
        NameTypeAuthority oldNameTypeAuthority = nameTypeAuthority;
        nameTypeAuthority = newNameTypeAuthority;
        boolean oldNameTypeAuthorityESet = nameTypeAuthorityESet;
        nameTypeAuthorityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY, oldNameTypeAuthority, newNameTypeAuthority,
                    !oldNameTypeAuthorityESet );
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
    public void setNameTypeAuthority( NameTypeAuthority newNameTypeAuthority ) {
        if( newNameTypeAuthority != nameTypeAuthority ) {
            NotificationChain msgs = null;
            if( nameTypeAuthority != null ) msgs = ( ( InternalEObject ) nameTypeAuthority ).eInverseRemove( this,
                    CimPackage.NAME_TYPE_AUTHORITY__NAME_TYPES, NameTypeAuthority.class, msgs );
            if( newNameTypeAuthority != null ) msgs = ( ( InternalEObject ) newNameTypeAuthority ).eInverseAdd( this,
                    CimPackage.NAME_TYPE_AUTHORITY__NAME_TYPES, NameTypeAuthority.class, msgs );
            msgs = basicSetNameTypeAuthority( newNameTypeAuthority, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNameTypeAuthorityESet = nameTypeAuthorityESet;
            nameTypeAuthorityESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY,
                        newNameTypeAuthority, newNameTypeAuthority, !oldNameTypeAuthorityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNameTypeAuthority( NotificationChain msgs ) {
        NameTypeAuthority oldNameTypeAuthority = nameTypeAuthority;
        nameTypeAuthority = null;
        boolean oldNameTypeAuthorityESet = nameTypeAuthorityESet;
        nameTypeAuthorityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY, oldNameTypeAuthority, null, oldNameTypeAuthorityESet );
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
    public void unsetNameTypeAuthority() {
        if( nameTypeAuthority != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) nameTypeAuthority ).eInverseRemove( this,
                    CimPackage.NAME_TYPE_AUTHORITY__NAME_TYPES, NameTypeAuthority.class, msgs );
            msgs = basicUnsetNameTypeAuthority( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNameTypeAuthorityESet = nameTypeAuthorityESet;
            nameTypeAuthorityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY, null, null, oldNameTypeAuthorityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNameTypeAuthority() {
        return nameTypeAuthorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Name > getNames() {
        if( names == null ) {
            names = new EObjectWithInverseResolvingEList.Unsettable< Name >( Name.class, this,
                    CimPackage.NAME_TYPE__NAMES, CimPackage.NAME__NAME_TYPE );
        }
        return names;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNames() {
        if( names != null ) ( ( InternalEList.Unsettable< ? > ) names ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNames() {
        return names != null && ( ( InternalEList.Unsettable< ? > ) names ).isSet();
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
        case CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
            if( nameTypeAuthority != null ) msgs = ( ( InternalEObject ) nameTypeAuthority ).eInverseRemove( this,
                    CimPackage.NAME_TYPE_AUTHORITY__NAME_TYPES, NameTypeAuthority.class, msgs );
            return basicSetNameTypeAuthority( ( NameTypeAuthority ) otherEnd, msgs );
        case CimPackage.NAME_TYPE__NAMES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getNames() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
            return basicUnsetNameTypeAuthority( msgs );
        case CimPackage.NAME_TYPE__NAMES:
            return ( ( InternalEList< ? > ) getNames() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.NAME_TYPE__DESCRIPTION:
            return getDescription();
        case CimPackage.NAME_TYPE__NAME:
            return getName();
        case CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
            return getNameTypeAuthority();
        case CimPackage.NAME_TYPE__NAMES:
            return getNames();
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
        case CimPackage.NAME_TYPE__DESCRIPTION:
            setDescription( ( String ) newValue );
            return;
        case CimPackage.NAME_TYPE__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
            setNameTypeAuthority( ( NameTypeAuthority ) newValue );
            return;
        case CimPackage.NAME_TYPE__NAMES:
            getNames().clear();
            getNames().addAll( ( Collection< ? extends Name > ) newValue );
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
        case CimPackage.NAME_TYPE__DESCRIPTION:
            unsetDescription();
            return;
        case CimPackage.NAME_TYPE__NAME:
            unsetName();
            return;
        case CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
            unsetNameTypeAuthority();
            return;
        case CimPackage.NAME_TYPE__NAMES:
            unsetNames();
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
        case CimPackage.NAME_TYPE__DESCRIPTION:
            return isSetDescription();
        case CimPackage.NAME_TYPE__NAME:
            return isSetName();
        case CimPackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
            return isSetNameTypeAuthority();
        case CimPackage.NAME_TYPE__NAMES:
            return isSetNames();
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
        result.append( " (description: " );
        if( descriptionESet )
            result.append( description );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //NameTypeImpl
