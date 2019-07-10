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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadArea;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea;

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
 * An implementation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubLoadAreaImpl#getLoadGroups <em>Load Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubLoadAreaImpl#getLoadArea <em>Load Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubLoadAreaImpl extends EnergyAreaImpl implements SubLoadArea {
    /**
     * The cached value of the '{@link #getLoadGroups() <em>Load Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadGroups()
     * @generated
     * @ordered
     */
    protected EList< LoadGroup > loadGroups;

    /**
     * The cached value of the '{@link #getLoadArea() <em>Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadArea()
     * @generated
     * @ordered
     */
    protected LoadArea loadArea;

    /**
     * This is true if the Load Area reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadAreaESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubLoadAreaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSubLoadArea();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LoadGroup > getLoadGroups() {
        if( loadGroups == null ) {
            loadGroups = new EObjectWithInverseResolvingEList.Unsettable< LoadGroup >( LoadGroup.class, this,
                    CimPackage.SUB_LOAD_AREA__LOAD_GROUPS, CimPackage.LOAD_GROUP__SUB_LOAD_AREA );
        }
        return loadGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLoadGroups() {
        if( loadGroups != null ) ( ( InternalEList.Unsettable< ? > ) loadGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadGroups() {
        return loadGroups != null && ( ( InternalEList.Unsettable< ? > ) loadGroups ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadArea getLoadArea() {
        return loadArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadArea( LoadArea newLoadArea, NotificationChain msgs ) {
        LoadArea oldLoadArea = loadArea;
        loadArea = newLoadArea;
        boolean oldLoadAreaESet = loadAreaESet;
        loadAreaESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, newLoadArea, !oldLoadAreaESet );
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
    public void setLoadArea( LoadArea newLoadArea ) {
        if( newLoadArea != loadArea ) {
            NotificationChain msgs = null;
            if( loadArea != null ) msgs = ( ( InternalEObject ) loadArea ).eInverseRemove( this,
                    CimPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs );
            if( newLoadArea != null ) msgs = ( ( InternalEObject ) newLoadArea ).eInverseAdd( this,
                    CimPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs );
            msgs = basicSetLoadArea( newLoadArea, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadAreaESet = loadAreaESet;
            loadAreaESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SUB_LOAD_AREA__LOAD_AREA, newLoadArea, newLoadArea, !oldLoadAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadArea( NotificationChain msgs ) {
        LoadArea oldLoadArea = loadArea;
        loadArea = null;
        boolean oldLoadAreaESet = loadAreaESet;
        loadAreaESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SUB_LOAD_AREA__LOAD_AREA, oldLoadArea, null, oldLoadAreaESet );
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
    public void unsetLoadArea() {
        if( loadArea != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadArea ).eInverseRemove( this, CimPackage.LOAD_AREA__SUB_LOAD_AREAS,
                    LoadArea.class, msgs );
            msgs = basicUnsetLoadArea( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadAreaESet = loadAreaESet;
            loadAreaESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SUB_LOAD_AREA__LOAD_AREA, null, null, oldLoadAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadArea() {
        return loadAreaESet;
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
        case CimPackage.SUB_LOAD_AREA__LOAD_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLoadGroups() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SUB_LOAD_AREA__LOAD_AREA:
            if( loadArea != null ) msgs = ( ( InternalEObject ) loadArea ).eInverseRemove( this,
                    CimPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs );
            return basicSetLoadArea( ( LoadArea ) otherEnd, msgs );
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
        case CimPackage.SUB_LOAD_AREA__LOAD_GROUPS:
            return ( ( InternalEList< ? > ) getLoadGroups() ).basicRemove( otherEnd, msgs );
        case CimPackage.SUB_LOAD_AREA__LOAD_AREA:
            return basicUnsetLoadArea( msgs );
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
        case CimPackage.SUB_LOAD_AREA__LOAD_GROUPS:
            return getLoadGroups();
        case CimPackage.SUB_LOAD_AREA__LOAD_AREA:
            return getLoadArea();
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
        case CimPackage.SUB_LOAD_AREA__LOAD_GROUPS:
            getLoadGroups().clear();
            getLoadGroups().addAll( ( Collection< ? extends LoadGroup > ) newValue );
            return;
        case CimPackage.SUB_LOAD_AREA__LOAD_AREA:
            setLoadArea( ( LoadArea ) newValue );
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
        case CimPackage.SUB_LOAD_AREA__LOAD_GROUPS:
            unsetLoadGroups();
            return;
        case CimPackage.SUB_LOAD_AREA__LOAD_AREA:
            unsetLoadArea();
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
        case CimPackage.SUB_LOAD_AREA__LOAD_GROUPS:
            return isSetLoadGroups();
        case CimPackage.SUB_LOAD_AREA__LOAD_AREA:
            return isSetLoadArea();
        }
        return super.eIsSet( featureID );
    }

} //SubLoadAreaImpl
