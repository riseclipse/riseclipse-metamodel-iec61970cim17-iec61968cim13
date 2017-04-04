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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Data Set Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenericDataSetVersionImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenericDataSetVersionImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenericDataSetVersionImpl#getPublished <em>Published</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericDataSetVersionImpl extends CimObjectWithIDImpl implements GenericDataSetVersion {
    /**
     * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMajorVersion()
     * @generated
     * @ordered
     */
    protected static final String MAJOR_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMajorVersion()
     * @generated
     * @ordered
     */
    protected String majorVersion = MAJOR_VERSION_EDEFAULT;

    /**
     * This is true if the Major Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean majorVersionESet;

    /**
     * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinorVersion()
     * @generated
     * @ordered
     */
    protected static final String MINOR_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinorVersion()
     * @generated
     * @ordered
     */
    protected String minorVersion = MINOR_VERSION_EDEFAULT;

    /**
     * This is true if the Minor Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minorVersionESet;

    /**
     * The default value of the '{@link #getPublished() <em>Published</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublished()
     * @generated
     * @ordered
     */
    protected static final Date PUBLISHED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPublished() <em>Published</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublished()
     * @generated
     * @ordered
     */
    protected Date published = PUBLISHED_EDEFAULT;

    /**
     * This is true if the Published attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean publishedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericDataSetVersionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGenericDataSetVersion();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMajorVersion() {
        return majorVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMajorVersion( String newMajorVersion ) {
        String oldMajorVersion = majorVersion;
        majorVersion = newMajorVersion;
        boolean oldMajorVersionESet = majorVersionESet;
        majorVersionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERIC_DATA_SET_VERSION__MAJOR_VERSION,
                    oldMajorVersion, majorVersion, !oldMajorVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMajorVersion() {
        String oldMajorVersion = majorVersion;
        boolean oldMajorVersionESet = majorVersionESet;
        majorVersion = MAJOR_VERSION_EDEFAULT;
        majorVersionESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERIC_DATA_SET_VERSION__MAJOR_VERSION,
                        oldMajorVersion, MAJOR_VERSION_EDEFAULT, oldMajorVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMajorVersion() {
        return majorVersionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMinorVersion() {
        return minorVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinorVersion( String newMinorVersion ) {
        String oldMinorVersion = minorVersion;
        minorVersion = newMinorVersion;
        boolean oldMinorVersionESet = minorVersionESet;
        minorVersionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERIC_DATA_SET_VERSION__MINOR_VERSION,
                    oldMinorVersion, minorVersion, !oldMinorVersionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinorVersion() {
        String oldMinorVersion = minorVersion;
        boolean oldMinorVersionESet = minorVersionESet;
        minorVersion = MINOR_VERSION_EDEFAULT;
        minorVersionESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERIC_DATA_SET_VERSION__MINOR_VERSION,
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
    public Date getPublished() {
        return published;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPublished( Date newPublished ) {
        Date oldPublished = published;
        published = newPublished;
        boolean oldPublishedESet = publishedESet;
        publishedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERIC_DATA_SET_VERSION__PUBLISHED, oldPublished, published, !oldPublishedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPublished() {
        Date oldPublished = published;
        boolean oldPublishedESet = publishedESet;
        published = PUBLISHED_EDEFAULT;
        publishedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERIC_DATA_SET_VERSION__PUBLISHED, oldPublished, PUBLISHED_EDEFAULT, oldPublishedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPublished() {
        return publishedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GENERIC_DATA_SET_VERSION__MAJOR_VERSION:
            return getMajorVersion();
        case CimPackage.GENERIC_DATA_SET_VERSION__MINOR_VERSION:
            return getMinorVersion();
        case CimPackage.GENERIC_DATA_SET_VERSION__PUBLISHED:
            return getPublished();
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
        case CimPackage.GENERIC_DATA_SET_VERSION__MAJOR_VERSION:
            setMajorVersion( ( String ) newValue );
            return;
        case CimPackage.GENERIC_DATA_SET_VERSION__MINOR_VERSION:
            setMinorVersion( ( String ) newValue );
            return;
        case CimPackage.GENERIC_DATA_SET_VERSION__PUBLISHED:
            setPublished( ( Date ) newValue );
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
        case CimPackage.GENERIC_DATA_SET_VERSION__MAJOR_VERSION:
            unsetMajorVersion();
            return;
        case CimPackage.GENERIC_DATA_SET_VERSION__MINOR_VERSION:
            unsetMinorVersion();
            return;
        case CimPackage.GENERIC_DATA_SET_VERSION__PUBLISHED:
            unsetPublished();
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
        case CimPackage.GENERIC_DATA_SET_VERSION__MAJOR_VERSION:
            return isSetMajorVersion();
        case CimPackage.GENERIC_DATA_SET_VERSION__MINOR_VERSION:
            return isSetMinorVersion();
        case CimPackage.GENERIC_DATA_SET_VERSION__PUBLISHED:
            return isSetPublished();
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
        result.append( " (majorVersion: " );
        if( majorVersionESet )
            result.append( majorVersion );
        else
            result.append( "<unset>" );
        result.append( ", minorVersion: " );
        if( minorVersionESet )
            result.append( minorVersion );
        else
            result.append( "<unset>" );
        result.append( ", published: " );
        if( publishedESet )
            result.append( published );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GenericDataSetVersionImpl
