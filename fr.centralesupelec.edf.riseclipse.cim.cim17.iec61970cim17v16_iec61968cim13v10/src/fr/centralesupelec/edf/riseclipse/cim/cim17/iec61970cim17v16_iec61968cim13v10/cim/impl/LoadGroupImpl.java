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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGroupImpl#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadGroupImpl extends IdentifiedObjectImpl implements LoadGroup {
    /**
     * The cached value of the '{@link #getSubLoadArea() <em>Sub Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubLoadArea()
     * @generated
     * @ordered
     */
    protected SubLoadArea subLoadArea;

    /**
     * This is true if the Sub Load Area reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subLoadAreaESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubLoadArea getSubLoadArea() {
        return subLoadArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubLoadArea( SubLoadArea newSubLoadArea, NotificationChain msgs ) {
        SubLoadArea oldSubLoadArea = subLoadArea;
        subLoadArea = newSubLoadArea;
        boolean oldSubLoadAreaESet = subLoadAreaESet;
        subLoadAreaESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, newSubLoadArea, !oldSubLoadAreaESet );
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
    public void setSubLoadArea( SubLoadArea newSubLoadArea ) {
        if( newSubLoadArea != subLoadArea ) {
            NotificationChain msgs = null;
            if( subLoadArea != null ) msgs = ( ( InternalEObject ) subLoadArea ).eInverseRemove( this,
                    CimPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs );
            if( newSubLoadArea != null ) msgs = ( ( InternalEObject ) newSubLoadArea ).eInverseAdd( this,
                    CimPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs );
            msgs = basicSetSubLoadArea( newSubLoadArea, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubLoadAreaESet = subLoadAreaESet;
            subLoadAreaESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_GROUP__SUB_LOAD_AREA, newSubLoadArea, newSubLoadArea, !oldSubLoadAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSubLoadArea( NotificationChain msgs ) {
        SubLoadArea oldSubLoadArea = subLoadArea;
        subLoadArea = null;
        boolean oldSubLoadAreaESet = subLoadAreaESet;
        subLoadAreaESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_GROUP__SUB_LOAD_AREA, oldSubLoadArea, null, oldSubLoadAreaESet );
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
    public void unsetSubLoadArea() {
        if( subLoadArea != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) subLoadArea ).eInverseRemove( this, CimPackage.SUB_LOAD_AREA__LOAD_GROUPS,
                    SubLoadArea.class, msgs );
            msgs = basicUnsetSubLoadArea( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubLoadAreaESet = subLoadAreaESet;
            subLoadAreaESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_GROUP__SUB_LOAD_AREA, null, null, oldSubLoadAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubLoadArea() {
        return subLoadAreaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LOAD_GROUP__SUB_LOAD_AREA:
            if( subLoadArea != null ) msgs = ( ( InternalEObject ) subLoadArea ).eInverseRemove( this,
                    CimPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs );
            return basicSetSubLoadArea( ( SubLoadArea ) otherEnd, msgs );
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
        case CimPackage.LOAD_GROUP__SUB_LOAD_AREA:
            return basicUnsetSubLoadArea( msgs );
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
        case CimPackage.LOAD_GROUP__SUB_LOAD_AREA:
            return getSubLoadArea();
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
        case CimPackage.LOAD_GROUP__SUB_LOAD_AREA:
            setSubLoadArea( ( SubLoadArea ) newValue );
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
        case CimPackage.LOAD_GROUP__SUB_LOAD_AREA:
            unsetSubLoadArea();
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
        case CimPackage.LOAD_GROUP__SUB_LOAD_AREA:
            return isSetSubLoadArea();
        }
        return super.eIsSet( featureID );
    }

} //LoadGroupImpl
