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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExtensionItemImpl#getExtName <em>Ext Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExtensionItemImpl#getExtType <em>Ext Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExtensionItemImpl#getExtValue <em>Ext Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionItemImpl extends MinimalEObjectImpl.Container implements ExtensionItem {
    /**
     * The default value of the '{@link #getExtName() <em>Ext Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtName()
     * @generated
     * @ordered
     */
    protected static final String EXT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtName() <em>Ext Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtName()
     * @generated
     * @ordered
     */
    protected String extName = EXT_NAME_EDEFAULT;

    /**
     * This is true if the Ext Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extNameESet;

    /**
     * The default value of the '{@link #getExtType() <em>Ext Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtType()
     * @generated
     * @ordered
     */
    protected static final String EXT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtType() <em>Ext Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtType()
     * @generated
     * @ordered
     */
    protected String extType = EXT_TYPE_EDEFAULT;

    /**
     * This is true if the Ext Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extTypeESet;

    /**
     * The default value of the '{@link #getExtValue() <em>Ext Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtValue()
     * @generated
     * @ordered
     */
    protected static final String EXT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtValue() <em>Ext Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtValue()
     * @generated
     * @ordered
     */
    protected String extValue = EXT_VALUE_EDEFAULT;

    /**
     * This is true if the Ext Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtensionItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExtensionItem();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtName() {
        return extName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtName( String newExtName ) {
        String oldExtName = extName;
        extName = newExtName;
        boolean oldExtNameESet = extNameESet;
        extNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTENSION_ITEM__EXT_NAME, oldExtName, extName, !oldExtNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExtName() {
        String oldExtName = extName;
        boolean oldExtNameESet = extNameESet;
        extName = EXT_NAME_EDEFAULT;
        extNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTENSION_ITEM__EXT_NAME, oldExtName, EXT_NAME_EDEFAULT, oldExtNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtName() {
        return extNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtType() {
        return extType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtType( String newExtType ) {
        String oldExtType = extType;
        extType = newExtType;
        boolean oldExtTypeESet = extTypeESet;
        extTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTENSION_ITEM__EXT_TYPE, oldExtType, extType, !oldExtTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExtType() {
        String oldExtType = extType;
        boolean oldExtTypeESet = extTypeESet;
        extType = EXT_TYPE_EDEFAULT;
        extTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTENSION_ITEM__EXT_TYPE, oldExtType, EXT_TYPE_EDEFAULT, oldExtTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtType() {
        return extTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtValue() {
        return extValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtValue( String newExtValue ) {
        String oldExtValue = extValue;
        extValue = newExtValue;
        boolean oldExtValueESet = extValueESet;
        extValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXTENSION_ITEM__EXT_VALUE, oldExtValue, extValue, !oldExtValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExtValue() {
        String oldExtValue = extValue;
        boolean oldExtValueESet = extValueESet;
        extValue = EXT_VALUE_EDEFAULT;
        extValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXTENSION_ITEM__EXT_VALUE, oldExtValue, EXT_VALUE_EDEFAULT, oldExtValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtValue() {
        return extValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXTENSION_ITEM__EXT_NAME:
            return getExtName();
        case CimPackage.EXTENSION_ITEM__EXT_TYPE:
            return getExtType();
        case CimPackage.EXTENSION_ITEM__EXT_VALUE:
            return getExtValue();
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
        case CimPackage.EXTENSION_ITEM__EXT_NAME:
            setExtName( ( String ) newValue );
            return;
        case CimPackage.EXTENSION_ITEM__EXT_TYPE:
            setExtType( ( String ) newValue );
            return;
        case CimPackage.EXTENSION_ITEM__EXT_VALUE:
            setExtValue( ( String ) newValue );
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
        case CimPackage.EXTENSION_ITEM__EXT_NAME:
            unsetExtName();
            return;
        case CimPackage.EXTENSION_ITEM__EXT_TYPE:
            unsetExtType();
            return;
        case CimPackage.EXTENSION_ITEM__EXT_VALUE:
            unsetExtValue();
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
        case CimPackage.EXTENSION_ITEM__EXT_NAME:
            return isSetExtName();
        case CimPackage.EXTENSION_ITEM__EXT_TYPE:
            return isSetExtType();
        case CimPackage.EXTENSION_ITEM__EXT_VALUE:
            return isSetExtValue();
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
        result.append( " (extName: " );
        if( extNameESet )
            result.append( extName );
        else
            result.append( "<unset>" );
        result.append( ", extType: " );
        if( extTypeESet )
            result.append( extType );
        else
            result.append( "<unset>" );
        result.append( ", extValue: " );
        if( extValueESet )
            result.append( extValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExtensionItemImpl
