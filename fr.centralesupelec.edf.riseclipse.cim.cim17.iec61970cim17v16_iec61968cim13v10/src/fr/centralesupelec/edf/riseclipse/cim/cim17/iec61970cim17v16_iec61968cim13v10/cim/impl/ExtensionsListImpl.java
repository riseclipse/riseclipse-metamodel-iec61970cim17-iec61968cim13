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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionItem;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExtensionsList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensions List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExtensionsListImpl#getExtensionsItem <em>Extensions Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionsListImpl extends MinimalEObjectImpl.Container implements ExtensionsList {
    /**
     * The cached value of the '{@link #getExtensionsItem() <em>Extensions Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtensionsItem()
     * @generated
     * @ordered
     */
    protected ExtensionItem extensionsItem;

    /**
     * This is true if the Extensions Item containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extensionsItemESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtensionsListImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExtensionsList();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExtensionItem getExtensionsItem() {
        return extensionsItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtensionsItem( ExtensionItem newExtensionsItem, NotificationChain msgs ) {
        ExtensionItem oldExtensionsItem = extensionsItem;
        extensionsItem = newExtensionsItem;
        boolean oldExtensionsItemESet = extensionsItemESet;
        extensionsItemESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM, oldExtensionsItem, newExtensionsItem,
                    !oldExtensionsItemESet );
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
    public void setExtensionsItem( ExtensionItem newExtensionsItem ) {
        if( newExtensionsItem != extensionsItem ) {
            NotificationChain msgs = null;
            if( extensionsItem != null ) msgs = ( ( InternalEObject ) extensionsItem ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM, null, msgs );
            if( newExtensionsItem != null ) msgs = ( ( InternalEObject ) newExtensionsItem ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM, null, msgs );
            msgs = basicSetExtensionsItem( newExtensionsItem, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExtensionsItemESet = extensionsItemESet;
            extensionsItemESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM,
                        newExtensionsItem, newExtensionsItem, !oldExtensionsItemESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetExtensionsItem( NotificationChain msgs ) {
        ExtensionItem oldExtensionsItem = extensionsItem;
        extensionsItem = null;
        boolean oldExtensionsItemESet = extensionsItemESet;
        extensionsItemESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM, oldExtensionsItem, null, oldExtensionsItemESet );
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
    public void unsetExtensionsItem() {
        if( extensionsItem != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) extensionsItem ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM, null, msgs );
            msgs = basicUnsetExtensionsItem( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExtensionsItemESet = extensionsItemESet;
            extensionsItemESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM, null, null, oldExtensionsItemESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtensionsItem() {
        return extensionsItemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM:
            return basicUnsetExtensionsItem( msgs );
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
        case CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM:
            return getExtensionsItem();
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
        case CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM:
            setExtensionsItem( ( ExtensionItem ) newValue );
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
        case CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM:
            unsetExtensionsItem();
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
        case CimPackage.EXTENSIONS_LIST__EXTENSIONS_ITEM:
            return isSetExtensionsItem();
        }
        return super.eIsSet( featureID );
    }

} //ExtensionsListImpl
