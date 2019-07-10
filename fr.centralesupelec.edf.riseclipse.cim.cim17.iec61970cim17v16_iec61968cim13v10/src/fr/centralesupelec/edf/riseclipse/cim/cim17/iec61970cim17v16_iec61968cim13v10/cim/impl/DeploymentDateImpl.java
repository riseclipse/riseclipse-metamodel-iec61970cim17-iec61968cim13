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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DeploymentDateImpl#getInServiceDate <em>In Service Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DeploymentDateImpl#getInstalledDate <em>Installed Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DeploymentDateImpl#getNotYetInstalledDate <em>Not Yet Installed Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DeploymentDateImpl#getOutOfServiceDate <em>Out Of Service Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DeploymentDateImpl#getRemovedDate <em>Removed Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentDateImpl extends MinimalEObjectImpl.Container implements DeploymentDate {
    /**
     * The default value of the '{@link #getInServiceDate() <em>In Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInServiceDate()
     * @generated
     * @ordered
     */
    protected static final Date IN_SERVICE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInServiceDate() <em>In Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInServiceDate()
     * @generated
     * @ordered
     */
    protected Date inServiceDate = IN_SERVICE_DATE_EDEFAULT;

    /**
     * This is true if the In Service Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inServiceDateESet;

    /**
     * The default value of the '{@link #getInstalledDate() <em>Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstalledDate()
     * @generated
     * @ordered
     */
    protected static final Date INSTALLED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstalledDate() <em>Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstalledDate()
     * @generated
     * @ordered
     */
    protected Date installedDate = INSTALLED_DATE_EDEFAULT;

    /**
     * This is true if the Installed Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean installedDateESet;

    /**
     * The default value of the '{@link #getNotYetInstalledDate() <em>Not Yet Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotYetInstalledDate()
     * @generated
     * @ordered
     */
    protected static final Date NOT_YET_INSTALLED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNotYetInstalledDate() <em>Not Yet Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotYetInstalledDate()
     * @generated
     * @ordered
     */
    protected Date notYetInstalledDate = NOT_YET_INSTALLED_DATE_EDEFAULT;

    /**
     * This is true if the Not Yet Installed Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean notYetInstalledDateESet;

    /**
     * The default value of the '{@link #getOutOfServiceDate() <em>Out Of Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOfServiceDate()
     * @generated
     * @ordered
     */
    protected static final Date OUT_OF_SERVICE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutOfServiceDate() <em>Out Of Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOfServiceDate()
     * @generated
     * @ordered
     */
    protected Date outOfServiceDate = OUT_OF_SERVICE_DATE_EDEFAULT;

    /**
     * This is true if the Out Of Service Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outOfServiceDateESet;

    /**
     * The default value of the '{@link #getRemovedDate() <em>Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemovedDate()
     * @generated
     * @ordered
     */
    protected static final Date REMOVED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemovedDate() <em>Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemovedDate()
     * @generated
     * @ordered
     */
    protected Date removedDate = REMOVED_DATE_EDEFAULT;

    /**
     * This is true if the Removed Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean removedDateESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeploymentDateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDeploymentDate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getInServiceDate() {
        return inServiceDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInServiceDate( Date newInServiceDate ) {
        Date oldInServiceDate = inServiceDate;
        inServiceDate = newInServiceDate;
        boolean oldInServiceDateESet = inServiceDateESet;
        inServiceDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DEPLOYMENT_DATE__IN_SERVICE_DATE, oldInServiceDate, inServiceDate, !oldInServiceDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInServiceDate() {
        Date oldInServiceDate = inServiceDate;
        boolean oldInServiceDateESet = inServiceDateESet;
        inServiceDate = IN_SERVICE_DATE_EDEFAULT;
        inServiceDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DEPLOYMENT_DATE__IN_SERVICE_DATE,
                    oldInServiceDate, IN_SERVICE_DATE_EDEFAULT, oldInServiceDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInServiceDate() {
        return inServiceDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getInstalledDate() {
        return installedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstalledDate( Date newInstalledDate ) {
        Date oldInstalledDate = installedDate;
        installedDate = newInstalledDate;
        boolean oldInstalledDateESet = installedDateESet;
        installedDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DEPLOYMENT_DATE__INSTALLED_DATE, oldInstalledDate, installedDate, !oldInstalledDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInstalledDate() {
        Date oldInstalledDate = installedDate;
        boolean oldInstalledDateESet = installedDateESet;
        installedDate = INSTALLED_DATE_EDEFAULT;
        installedDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DEPLOYMENT_DATE__INSTALLED_DATE,
                    oldInstalledDate, INSTALLED_DATE_EDEFAULT, oldInstalledDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInstalledDate() {
        return installedDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getNotYetInstalledDate() {
        return notYetInstalledDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNotYetInstalledDate( Date newNotYetInstalledDate ) {
        Date oldNotYetInstalledDate = notYetInstalledDate;
        notYetInstalledDate = newNotYetInstalledDate;
        boolean oldNotYetInstalledDateESet = notYetInstalledDateESet;
        notYetInstalledDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DEPLOYMENT_DATE__NOT_YET_INSTALLED_DATE,
                    oldNotYetInstalledDate, notYetInstalledDate, !oldNotYetInstalledDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNotYetInstalledDate() {
        Date oldNotYetInstalledDate = notYetInstalledDate;
        boolean oldNotYetInstalledDateESet = notYetInstalledDateESet;
        notYetInstalledDate = NOT_YET_INSTALLED_DATE_EDEFAULT;
        notYetInstalledDateESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.DEPLOYMENT_DATE__NOT_YET_INSTALLED_DATE,
                        oldNotYetInstalledDate, NOT_YET_INSTALLED_DATE_EDEFAULT, oldNotYetInstalledDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNotYetInstalledDate() {
        return notYetInstalledDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getOutOfServiceDate() {
        return outOfServiceDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutOfServiceDate( Date newOutOfServiceDate ) {
        Date oldOutOfServiceDate = outOfServiceDate;
        outOfServiceDate = newOutOfServiceDate;
        boolean oldOutOfServiceDateESet = outOfServiceDateESet;
        outOfServiceDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DEPLOYMENT_DATE__OUT_OF_SERVICE_DATE,
                    oldOutOfServiceDate, outOfServiceDate, !oldOutOfServiceDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutOfServiceDate() {
        Date oldOutOfServiceDate = outOfServiceDate;
        boolean oldOutOfServiceDateESet = outOfServiceDateESet;
        outOfServiceDate = OUT_OF_SERVICE_DATE_EDEFAULT;
        outOfServiceDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DEPLOYMENT_DATE__OUT_OF_SERVICE_DATE,
                    oldOutOfServiceDate, OUT_OF_SERVICE_DATE_EDEFAULT, oldOutOfServiceDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutOfServiceDate() {
        return outOfServiceDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getRemovedDate() {
        return removedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemovedDate( Date newRemovedDate ) {
        Date oldRemovedDate = removedDate;
        removedDate = newRemovedDate;
        boolean oldRemovedDateESet = removedDateESet;
        removedDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DEPLOYMENT_DATE__REMOVED_DATE, oldRemovedDate, removedDate, !oldRemovedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemovedDate() {
        Date oldRemovedDate = removedDate;
        boolean oldRemovedDateESet = removedDateESet;
        removedDate = REMOVED_DATE_EDEFAULT;
        removedDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DEPLOYMENT_DATE__REMOVED_DATE, oldRemovedDate, REMOVED_DATE_EDEFAULT, oldRemovedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemovedDate() {
        return removedDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DEPLOYMENT_DATE__IN_SERVICE_DATE:
            return getInServiceDate();
        case CimPackage.DEPLOYMENT_DATE__INSTALLED_DATE:
            return getInstalledDate();
        case CimPackage.DEPLOYMENT_DATE__NOT_YET_INSTALLED_DATE:
            return getNotYetInstalledDate();
        case CimPackage.DEPLOYMENT_DATE__OUT_OF_SERVICE_DATE:
            return getOutOfServiceDate();
        case CimPackage.DEPLOYMENT_DATE__REMOVED_DATE:
            return getRemovedDate();
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
        case CimPackage.DEPLOYMENT_DATE__IN_SERVICE_DATE:
            setInServiceDate( ( Date ) newValue );
            return;
        case CimPackage.DEPLOYMENT_DATE__INSTALLED_DATE:
            setInstalledDate( ( Date ) newValue );
            return;
        case CimPackage.DEPLOYMENT_DATE__NOT_YET_INSTALLED_DATE:
            setNotYetInstalledDate( ( Date ) newValue );
            return;
        case CimPackage.DEPLOYMENT_DATE__OUT_OF_SERVICE_DATE:
            setOutOfServiceDate( ( Date ) newValue );
            return;
        case CimPackage.DEPLOYMENT_DATE__REMOVED_DATE:
            setRemovedDate( ( Date ) newValue );
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
        case CimPackage.DEPLOYMENT_DATE__IN_SERVICE_DATE:
            unsetInServiceDate();
            return;
        case CimPackage.DEPLOYMENT_DATE__INSTALLED_DATE:
            unsetInstalledDate();
            return;
        case CimPackage.DEPLOYMENT_DATE__NOT_YET_INSTALLED_DATE:
            unsetNotYetInstalledDate();
            return;
        case CimPackage.DEPLOYMENT_DATE__OUT_OF_SERVICE_DATE:
            unsetOutOfServiceDate();
            return;
        case CimPackage.DEPLOYMENT_DATE__REMOVED_DATE:
            unsetRemovedDate();
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
        case CimPackage.DEPLOYMENT_DATE__IN_SERVICE_DATE:
            return isSetInServiceDate();
        case CimPackage.DEPLOYMENT_DATE__INSTALLED_DATE:
            return isSetInstalledDate();
        case CimPackage.DEPLOYMENT_DATE__NOT_YET_INSTALLED_DATE:
            return isSetNotYetInstalledDate();
        case CimPackage.DEPLOYMENT_DATE__OUT_OF_SERVICE_DATE:
            return isSetOutOfServiceDate();
        case CimPackage.DEPLOYMENT_DATE__REMOVED_DATE:
            return isSetRemovedDate();
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
        result.append( " (inServiceDate: " );
        if( inServiceDateESet )
            result.append( inServiceDate );
        else
            result.append( "<unset>" );
        result.append( ", installedDate: " );
        if( installedDateESet )
            result.append( installedDate );
        else
            result.append( "<unset>" );
        result.append( ", notYetInstalledDate: " );
        if( notYetInstalledDateESet )
            result.append( notYetInstalledDate );
        else
            result.append( "<unset>" );
        result.append( ", outOfServiceDate: " );
        if( outOfServiceDateESet )
            result.append( outOfServiceDate );
        else
            result.append( "<unset>" );
        result.append( ", removedDate: " );
        if( removedDateESet )
            result.append( removedDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DeploymentDateImpl
