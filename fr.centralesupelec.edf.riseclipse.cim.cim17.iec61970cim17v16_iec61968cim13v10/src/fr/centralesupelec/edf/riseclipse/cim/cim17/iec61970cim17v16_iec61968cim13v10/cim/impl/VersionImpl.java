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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Version;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VersionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VersionImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VersionImpl#getMinor <em>Minor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VersionImpl#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version {
    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * This is true if the Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dateESet;

    /**
     * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMajor()
     * @generated
     * @ordered
     */
    protected static final Integer MAJOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMajor()
     * @generated
     * @ordered
     */
    protected Integer major = MAJOR_EDEFAULT;

    /**
     * This is true if the Major attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean majorESet;

    /**
     * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinor()
     * @generated
     * @ordered
     */
    protected static final Integer MINOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinor()
     * @generated
     * @ordered
     */
    protected Integer minor = MINOR_EDEFAULT;

    /**
     * This is true if the Minor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minorESet;

    /**
     * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected static final Integer REVISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevision()
     * @generated
     * @ordered
     */
    protected Integer revision = REVISION_EDEFAULT;

    /**
     * This is true if the Revision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revisionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VersionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVersion();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDate( Date newDate ) {
        Date oldDate = date;
        date = newDate;
        boolean oldDateESet = dateESet;
        dateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VERSION__DATE,
                oldDate, date, !oldDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDate() {
        Date oldDate = date;
        boolean oldDateESet = dateESet;
        date = DATE_EDEFAULT;
        dateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VERSION__DATE, oldDate, DATE_EDEFAULT, oldDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDate() {
        return dateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMajor() {
        return major;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMajor( Integer newMajor ) {
        Integer oldMajor = major;
        major = newMajor;
        boolean oldMajorESet = majorESet;
        majorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VERSION__MAJOR,
                oldMajor, major, !oldMajorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMajor() {
        Integer oldMajor = major;
        boolean oldMajorESet = majorESet;
        major = MAJOR_EDEFAULT;
        majorESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VERSION__MAJOR, oldMajor, MAJOR_EDEFAULT, oldMajorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMajor() {
        return majorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMinor() {
        return minor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinor( Integer newMinor ) {
        Integer oldMinor = minor;
        minor = newMinor;
        boolean oldMinorESet = minorESet;
        minorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VERSION__MINOR,
                oldMinor, minor, !oldMinorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinor() {
        Integer oldMinor = minor;
        boolean oldMinorESet = minorESet;
        minor = MINOR_EDEFAULT;
        minorESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VERSION__MINOR, oldMinor, MINOR_EDEFAULT, oldMinorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinor() {
        return minorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getRevision() {
        return revision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevision( Integer newRevision ) {
        Integer oldRevision = revision;
        revision = newRevision;
        boolean oldRevisionESet = revisionESet;
        revisionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VERSION__REVISION, oldRevision, revision, !oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevision() {
        Integer oldRevision = revision;
        boolean oldRevisionESet = revisionESet;
        revision = REVISION_EDEFAULT;
        revisionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VERSION__REVISION, oldRevision, REVISION_EDEFAULT, oldRevisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevision() {
        return revisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.VERSION__DATE:
            return getDate();
        case CimPackage.VERSION__MAJOR:
            return getMajor();
        case CimPackage.VERSION__MINOR:
            return getMinor();
        case CimPackage.VERSION__REVISION:
            return getRevision();
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
        case CimPackage.VERSION__DATE:
            setDate( ( Date ) newValue );
            return;
        case CimPackage.VERSION__MAJOR:
            setMajor( ( Integer ) newValue );
            return;
        case CimPackage.VERSION__MINOR:
            setMinor( ( Integer ) newValue );
            return;
        case CimPackage.VERSION__REVISION:
            setRevision( ( Integer ) newValue );
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
        case CimPackage.VERSION__DATE:
            unsetDate();
            return;
        case CimPackage.VERSION__MAJOR:
            unsetMajor();
            return;
        case CimPackage.VERSION__MINOR:
            unsetMinor();
            return;
        case CimPackage.VERSION__REVISION:
            unsetRevision();
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
        case CimPackage.VERSION__DATE:
            return isSetDate();
        case CimPackage.VERSION__MAJOR:
            return isSetMajor();
        case CimPackage.VERSION__MINOR:
            return isSetMinor();
        case CimPackage.VERSION__REVISION:
            return isSetRevision();
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
        result.append( " (date: " );
        if( dateESet )
            result.append( date );
        else
            result.append( "<unset>" );
        result.append( ", major: " );
        if( majorESet )
            result.append( major );
        else
            result.append( "<unset>" );
        result.append( ", minor: " );
        if( minorESet )
            result.append( minor );
        else
            result.append( "<unset>" );
        result.append( ", revision: " );
        if( revisionESet )
            result.append( revision );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VersionImpl
