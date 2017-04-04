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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSetMember;

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
 * An implementation of the model object '<em><b>Instance Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InstanceSetImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InstanceSetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InstanceSetImpl#getInstanceSetMember <em>Instance Set Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceSetImpl extends DataSetImpl implements InstanceSet {
    /**
     * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinorVersion()
     * @generated
     * @ordered
     */
    protected static final Integer MINOR_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinorVersion()
     * @generated
     * @ordered
     */
    protected Integer minorVersion = MINOR_VERSION_EDEFAULT;

    /**
     * This is true if the Minor Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minorVersionESet;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final Integer VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected Integer version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * The cached value of the '{@link #getInstanceSetMember() <em>Instance Set Member</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstanceSetMember()
     * @generated
     * @ordered
     */
    protected EList< InstanceSetMember > instanceSetMember;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstanceSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getInstanceSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMinorVersion() {
        return minorVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinorVersion( Integer newMinorVersion ) {
        Integer oldMinorVersion = minorVersion;
        minorVersion = newMinorVersion;
        boolean oldMinorVersionESet = minorVersionESet;
        minorVersionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.INSTANCE_SET__MINOR_VERSION, oldMinorVersion, minorVersion, !oldMinorVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinorVersion() {
        Integer oldMinorVersion = minorVersion;
        boolean oldMinorVersionESet = minorVersionESet;
        minorVersion = MINOR_VERSION_EDEFAULT;
        minorVersionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.INSTANCE_SET__MINOR_VERSION,
                    oldMinorVersion, MINOR_VERSION_EDEFAULT, oldMinorVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinorVersion() {
        return minorVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion( Integer newVersion ) {
        Integer oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.INSTANCE_SET__VERSION, oldVersion, version, !oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVersion() {
        Integer oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.INSTANCE_SET__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVersion() {
        return versionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< InstanceSetMember > getInstanceSetMember() {
        if( instanceSetMember == null ) {
            instanceSetMember = new EObjectWithInverseResolvingEList.Unsettable< InstanceSetMember >(
                    InstanceSetMember.class, this, CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER,
                    CimPackage.INSTANCE_SET_MEMBER__INSTANCE_SET );
        }
        return instanceSetMember;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInstanceSetMember() {
        if( instanceSetMember != null ) ( ( InternalEList.Unsettable< ? > ) instanceSetMember ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstanceSetMember() {
        return instanceSetMember != null && ( ( InternalEList.Unsettable< ? > ) instanceSetMember ).isSet();
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
        case CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getInstanceSetMember() )
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
        case CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER:
            return ( ( InternalEList< ? > ) getInstanceSetMember() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.INSTANCE_SET__MINOR_VERSION:
            return getMinorVersion();
        case CimPackage.INSTANCE_SET__VERSION:
            return getVersion();
        case CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER:
            return getInstanceSetMember();
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
        case CimPackage.INSTANCE_SET__MINOR_VERSION:
            setMinorVersion( ( Integer ) newValue );
            return;
        case CimPackage.INSTANCE_SET__VERSION:
            setVersion( ( Integer ) newValue );
            return;
        case CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER:
            getInstanceSetMember().clear();
            getInstanceSetMember().addAll( ( Collection< ? extends InstanceSetMember > ) newValue );
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
        case CimPackage.INSTANCE_SET__MINOR_VERSION:
            unsetMinorVersion();
            return;
        case CimPackage.INSTANCE_SET__VERSION:
            unsetVersion();
            return;
        case CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER:
            unsetInstanceSetMember();
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
        case CimPackage.INSTANCE_SET__MINOR_VERSION:
            return isSetMinorVersion();
        case CimPackage.INSTANCE_SET__VERSION:
            return isSetVersion();
        case CimPackage.INSTANCE_SET__INSTANCE_SET_MEMBER:
            return isSetInstanceSetMember();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (minorVersion: " );
        if( minorVersionESet )
            result.append( minorVersion );
        else
            result.append( "<unset>" );
        result.append( ", version: " );
        if( versionESet )
            result.append( version );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //InstanceSetImpl
