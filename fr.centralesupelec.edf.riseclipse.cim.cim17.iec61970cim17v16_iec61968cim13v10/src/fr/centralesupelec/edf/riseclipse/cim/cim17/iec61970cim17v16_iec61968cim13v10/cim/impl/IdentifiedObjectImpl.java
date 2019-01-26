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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Name;

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
 * An implementation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getMRID <em>MRID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getNames <em>Names</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getPropertiesCIMDataObject <em>Properties CIM Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IdentifiedObjectImpl#getTargetingCIMDataObject <em>Targeting CIM Data Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedObjectImpl extends CimObjectWithIDImpl implements IdentifiedObject {
    /**
     * The default value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAliasName()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAliasName()
     * @generated
     * @ordered
     */
    protected String aliasName = ALIAS_NAME_EDEFAULT;

    /**
     * This is true if the Alias Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aliasNameESet;

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
     * The default value of the '{@link #getMRID() <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMRID()
     * @generated
     * @ordered
     */
    protected static final String MRID_EDEFAULT = null;

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
     * The cached value of the '{@link #getNames() <em>Names</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNames()
     * @generated
     * @ordered
     */
    protected EList< Name > names;

    /**
     * The cached value of the '{@link #getDiagramObjects() <em>Diagram Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramObjects()
     * @generated
     * @ordered
     */
    protected EList< DiagramObject > diagramObjects;

    /**
     * The cached value of the '{@link #getPropertiesCIMDataObject() <em>Properties CIM Data Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertiesCIMDataObject()
     * @generated
     * @ordered
     */
    protected DataSetMember propertiesCIMDataObject;

    /**
     * This is true if the Properties CIM Data Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean propertiesCIMDataObjectESet;

    /**
     * The cached value of the '{@link #getTargetingCIMDataObject() <em>Targeting CIM Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetingCIMDataObject()
     * @generated
     * @ordered
     */
    protected EList< DataSetMember > targetingCIMDataObject;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentifiedObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIdentifiedObject();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAliasName( String newAliasName ) {
        String oldAliasName = aliasName;
        aliasName = newAliasName;
        boolean oldAliasNameESet = aliasNameESet;
        aliasNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME, oldAliasName, aliasName, !oldAliasNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAliasName() {
        String oldAliasName = aliasName;
        boolean oldAliasNameESet = aliasNameESet;
        aliasName = ALIAS_NAME_EDEFAULT;
        aliasNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME, oldAliasName, ALIAS_NAME_EDEFAULT, oldAliasNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAliasName() {
        return aliasNameESet;
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
                CimPackage.IDENTIFIED_OBJECT__DESCRIPTION, oldDescription, description, !oldDescriptionESet ) );
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
                CimPackage.IDENTIFIED_OBJECT__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet ) );
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
     * @generated NOT
     */
    @Override
    public String getMRID() {
        return getID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void setMRID( String newMRID ) {
        setID( newMRID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public void unsetMRID() {
        unsetID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public boolean isSetMRID() {
        return isSetID();
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
                CimPackage.IDENTIFIED_OBJECT__NAME, oldName, name, !oldNameESet ) );
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
                CimPackage.IDENTIFIED_OBJECT__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
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
    public EList< Name > getNames() {
        if( names == null ) {
            names = new EObjectWithInverseResolvingEList.Unsettable< Name >( Name.class, this,
                    CimPackage.IDENTIFIED_OBJECT__NAMES, CimPackage.NAME__IDENTIFIED_OBJECT );
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
    @Override
    public EList< DiagramObject > getDiagramObjects() {
        if( diagramObjects == null ) {
            diagramObjects = new EObjectWithInverseResolvingEList.Unsettable< DiagramObject >( DiagramObject.class,
                    this, CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT );
        }
        return diagramObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiagramObjects() {
        if( diagramObjects != null ) ( ( InternalEList.Unsettable< ? > ) diagramObjects ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramObjects() {
        return diagramObjects != null && ( ( InternalEList.Unsettable< ? > ) diagramObjects ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataSetMember getPropertiesCIMDataObject() {
        if( propertiesCIMDataObject != null && propertiesCIMDataObject.eIsProxy() ) {
            InternalEObject oldPropertiesCIMDataObject = ( InternalEObject ) propertiesCIMDataObject;
            propertiesCIMDataObject = ( DataSetMember ) eResolveProxy( oldPropertiesCIMDataObject );
            if( propertiesCIMDataObject != oldPropertiesCIMDataObject ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, oldPropertiesCIMDataObject,
                        propertiesCIMDataObject ) );
            }
        }
        return propertiesCIMDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataSetMember basicGetPropertiesCIMDataObject() {
        return propertiesCIMDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPropertiesCIMDataObject( DataSetMember newPropertiesCIMDataObject,
            NotificationChain msgs ) {
        DataSetMember oldPropertiesCIMDataObject = propertiesCIMDataObject;
        propertiesCIMDataObject = newPropertiesCIMDataObject;
        boolean oldPropertiesCIMDataObjectESet = propertiesCIMDataObjectESet;
        propertiesCIMDataObjectESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, oldPropertiesCIMDataObject,
                    newPropertiesCIMDataObject, !oldPropertiesCIMDataObjectESet );
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
    public void setPropertiesCIMDataObject( DataSetMember newPropertiesCIMDataObject ) {
        if( newPropertiesCIMDataObject != propertiesCIMDataObject ) {
            NotificationChain msgs = null;
            if( propertiesCIMDataObject != null ) msgs = ( ( InternalEObject ) propertiesCIMDataObject )
                    .eInverseRemove( this, CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT, DataSetMember.class, msgs );
            if( newPropertiesCIMDataObject != null ) msgs = ( ( InternalEObject ) newPropertiesCIMDataObject )
                    .eInverseAdd( this, CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT, DataSetMember.class, msgs );
            msgs = basicSetPropertiesCIMDataObject( newPropertiesCIMDataObject, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPropertiesCIMDataObjectESet = propertiesCIMDataObjectESet;
            propertiesCIMDataObjectESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, newPropertiesCIMDataObject,
                    newPropertiesCIMDataObject, !oldPropertiesCIMDataObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPropertiesCIMDataObject( NotificationChain msgs ) {
        DataSetMember oldPropertiesCIMDataObject = propertiesCIMDataObject;
        propertiesCIMDataObject = null;
        boolean oldPropertiesCIMDataObjectESet = propertiesCIMDataObjectESet;
        propertiesCIMDataObjectESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, oldPropertiesCIMDataObject, null,
                    oldPropertiesCIMDataObjectESet );
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
    public void unsetPropertiesCIMDataObject() {
        if( propertiesCIMDataObject != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) propertiesCIMDataObject ).eInverseRemove( this,
                    CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT, DataSetMember.class, msgs );
            msgs = basicUnsetPropertiesCIMDataObject( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPropertiesCIMDataObjectESet = propertiesCIMDataObjectESet;
            propertiesCIMDataObjectESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT, null, null,
                    oldPropertiesCIMDataObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPropertiesCIMDataObject() {
        return propertiesCIMDataObjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DataSetMember > getTargetingCIMDataObject() {
        if( targetingCIMDataObject == null ) {
            targetingCIMDataObject = new EObjectWithInverseResolvingEList.Unsettable< DataSetMember >(
                    DataSetMember.class, this, CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT,
                    CimPackage.DATA_SET_MEMBER__TARGET_OBJECT );
        }
        return targetingCIMDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetingCIMDataObject() {
        if( targetingCIMDataObject != null ) ( ( InternalEList.Unsettable< ? > ) targetingCIMDataObject ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetingCIMDataObject() {
        return targetingCIMDataObject != null && ( ( InternalEList.Unsettable< ? > ) targetingCIMDataObject ).isSet();
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
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getNames() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiagramObjects() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT:
            if( propertiesCIMDataObject != null ) msgs = ( ( InternalEObject ) propertiesCIMDataObject )
                    .eInverseRemove( this, CimPackage.DATA_SET_MEMBER__PROPERTIES_OBJECT, DataSetMember.class, msgs );
            return basicSetPropertiesCIMDataObject( ( DataSetMember ) otherEnd, msgs );
        case CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTargetingCIMDataObject() )
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
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return ( ( InternalEList< ? > ) getNames() ).basicRemove( otherEnd, msgs );
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return ( ( InternalEList< ? > ) getDiagramObjects() ).basicRemove( otherEnd, msgs );
        case CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT:
            return basicUnsetPropertiesCIMDataObject( msgs );
        case CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT:
            return ( ( InternalEList< ? > ) getTargetingCIMDataObject() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            return getAliasName();
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            return getDescription();
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            return getMRID();
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            return getName();
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return getNames();
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return getDiagramObjects();
        case CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT:
            if( resolve ) return getPropertiesCIMDataObject();
            return basicGetPropertiesCIMDataObject();
        case CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT:
            return getTargetingCIMDataObject();
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            setAliasName( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            setDescription( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            setMRID( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            getNames().clear();
            getNames().addAll( ( Collection< ? extends Name > ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            getDiagramObjects().clear();
            getDiagramObjects().addAll( ( Collection< ? extends DiagramObject > ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT:
            setPropertiesCIMDataObject( ( DataSetMember ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT:
            getTargetingCIMDataObject().clear();
            getTargetingCIMDataObject().addAll( ( Collection< ? extends DataSetMember > ) newValue );
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            unsetAliasName();
            return;
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            unsetDescription();
            return;
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            unsetMRID();
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            unsetName();
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            unsetNames();
            return;
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            unsetDiagramObjects();
            return;
        case CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT:
            unsetPropertiesCIMDataObject();
            return;
        case CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT:
            unsetTargetingCIMDataObject();
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
        case CimPackage.IDENTIFIED_OBJECT__ALIAS_NAME:
            return isSetAliasName();
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            return isSetDescription();
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            return isSetMRID();
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            return isSetName();
        case CimPackage.IDENTIFIED_OBJECT__NAMES:
            return isSetNames();
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return isSetDiagramObjects();
        case CimPackage.IDENTIFIED_OBJECT__PROPERTIES_CIM_DATA_OBJECT:
            return isSetPropertiesCIMDataObject();
        case CimPackage.IDENTIFIED_OBJECT__TARGETING_CIM_DATA_OBJECT:
            return isSetTargetingCIMDataObject();
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
        result.append( " (aliasName: " );
        if( aliasNameESet )
            result.append( aliasName );
        else
            result.append( "<unset>" );
        result.append( ", description: " );
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

} //IdentifiedObjectImpl
