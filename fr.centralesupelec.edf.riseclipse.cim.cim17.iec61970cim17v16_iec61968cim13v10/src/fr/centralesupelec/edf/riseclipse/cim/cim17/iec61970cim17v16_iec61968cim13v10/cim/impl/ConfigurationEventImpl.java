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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Document;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getChangedServiceCategory <em>Changed Service Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getChangedDocument <em>Changed Document</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getChangedUsagePoint <em>Changed Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getChangedPersonRole <em>Changed Person Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getChangedAsset <em>Changed Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getChangedOrganisationRole <em>Changed Organisation Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConfigurationEventImpl#getChangedLocation <em>Changed Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationEventImpl extends ActivityRecordImpl implements ConfigurationEvent {
    /**
     * The default value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffectiveDateTime()
     * @generated
     * @ordered
     */
    protected static final Date EFFECTIVE_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffectiveDateTime()
     * @generated
     * @ordered
     */
    protected Date effectiveDateTime = EFFECTIVE_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Effective Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean effectiveDateTimeESet;

    /**
     * The default value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifiedBy()
     * @generated
     * @ordered
     */
    protected static final String MODIFIED_BY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifiedBy()
     * @generated
     * @ordered
     */
    protected String modifiedBy = MODIFIED_BY_EDEFAULT;

    /**
     * This is true if the Modified By attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modifiedByESet;

    /**
     * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected static final String REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected String remark = REMARK_EDEFAULT;

    /**
     * This is true if the Remark attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remarkESet;

    /**
     * The cached value of the '{@link #getChangedServiceCategory() <em>Changed Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangedServiceCategory()
     * @generated
     * @ordered
     */
    protected ServiceCategory changedServiceCategory;

    /**
     * This is true if the Changed Service Category reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedServiceCategoryESet;

    /**
     * The cached value of the '{@link #getChangedDocument() <em>Changed Document</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangedDocument()
     * @generated
     * @ordered
     */
    protected Document changedDocument;

    /**
     * This is true if the Changed Document reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedDocumentESet;

    /**
     * The cached value of the '{@link #getChangedUsagePoint() <em>Changed Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangedUsagePoint()
     * @generated
     * @ordered
     */
    protected UsagePoint changedUsagePoint;

    /**
     * This is true if the Changed Usage Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedUsagePointESet;

    /**
     * The cached value of the '{@link #getChangedPersonRole() <em>Changed Person Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangedPersonRole()
     * @generated
     * @ordered
     */
    protected PersonRole changedPersonRole;

    /**
     * This is true if the Changed Person Role reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedPersonRoleESet;

    /**
     * The cached value of the '{@link #getChangedAsset() <em>Changed Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangedAsset()
     * @generated
     * @ordered
     */
    protected Asset changedAsset;

    /**
     * This is true if the Changed Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedAssetESet;

    /**
     * The cached value of the '{@link #getChangedOrganisationRole() <em>Changed Organisation Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangedOrganisationRole()
     * @generated
     * @ordered
     */
    protected OrganisationRole changedOrganisationRole;

    /**
     * This is true if the Changed Organisation Role reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedOrganisationRoleESet;

    /**
     * The cached value of the '{@link #getChangedLocation() <em>Changed Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangedLocation()
     * @generated
     * @ordered
     */
    protected Location changedLocation;

    /**
     * This is true if the Changed Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changedLocationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigurationEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConfigurationEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEffectiveDateTime( Date newEffectiveDateTime ) {
        Date oldEffectiveDateTime = effectiveDateTime;
        effectiveDateTime = newEffectiveDateTime;
        boolean oldEffectiveDateTimeESet = effectiveDateTimeESet;
        effectiveDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONFIGURATION_EVENT__EFFECTIVE_DATE_TIME,
                    oldEffectiveDateTime, effectiveDateTime, !oldEffectiveDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEffectiveDateTime() {
        Date oldEffectiveDateTime = effectiveDateTime;
        boolean oldEffectiveDateTimeESet = effectiveDateTimeESet;
        effectiveDateTime = EFFECTIVE_DATE_TIME_EDEFAULT;
        effectiveDateTimeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONFIGURATION_EVENT__EFFECTIVE_DATE_TIME,
                        oldEffectiveDateTime, EFFECTIVE_DATE_TIME_EDEFAULT, oldEffectiveDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEffectiveDateTime() {
        return effectiveDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModifiedBy( String newModifiedBy ) {
        String oldModifiedBy = modifiedBy;
        modifiedBy = newModifiedBy;
        boolean oldModifiedByESet = modifiedByESet;
        modifiedByESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONFIGURATION_EVENT__MODIFIED_BY, oldModifiedBy, modifiedBy, !oldModifiedByESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModifiedBy() {
        String oldModifiedBy = modifiedBy;
        boolean oldModifiedByESet = modifiedByESet;
        modifiedBy = MODIFIED_BY_EDEFAULT;
        modifiedByESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONFIGURATION_EVENT__MODIFIED_BY, oldModifiedBy, MODIFIED_BY_EDEFAULT, oldModifiedByESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModifiedBy() {
        return modifiedByESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRemark() {
        return remark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemark( String newRemark ) {
        String oldRemark = remark;
        remark = newRemark;
        boolean oldRemarkESet = remarkESet;
        remarkESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONFIGURATION_EVENT__REMARK, oldRemark, remark, !oldRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemark() {
        String oldRemark = remark;
        boolean oldRemarkESet = remarkESet;
        remark = REMARK_EDEFAULT;
        remarkESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONFIGURATION_EVENT__REMARK, oldRemark, REMARK_EDEFAULT, oldRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemark() {
        return remarkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCategory getChangedServiceCategory() {
        return changedServiceCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangedServiceCategory( ServiceCategory newChangedServiceCategory,
            NotificationChain msgs ) {
        ServiceCategory oldChangedServiceCategory = changedServiceCategory;
        changedServiceCategory = newChangedServiceCategory;
        boolean oldChangedServiceCategoryESet = changedServiceCategoryESet;
        changedServiceCategoryESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY, oldChangedServiceCategory,
                    newChangedServiceCategory, !oldChangedServiceCategoryESet );
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
    public void setChangedServiceCategory( ServiceCategory newChangedServiceCategory ) {
        if( newChangedServiceCategory != changedServiceCategory ) {
            NotificationChain msgs = null;
            if( changedServiceCategory != null )
                msgs = ( ( InternalEObject ) changedServiceCategory ).eInverseRemove( this,
                        CimPackage.SERVICE_CATEGORY__CONFIGURATION_EVENTS, ServiceCategory.class, msgs );
            if( newChangedServiceCategory != null )
                msgs = ( ( InternalEObject ) newChangedServiceCategory ).eInverseAdd( this,
                        CimPackage.SERVICE_CATEGORY__CONFIGURATION_EVENTS, ServiceCategory.class, msgs );
            msgs = basicSetChangedServiceCategory( newChangedServiceCategory, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedServiceCategoryESet = changedServiceCategoryESet;
            changedServiceCategoryESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY, newChangedServiceCategory,
                    newChangedServiceCategory, !oldChangedServiceCategoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangedServiceCategory( NotificationChain msgs ) {
        ServiceCategory oldChangedServiceCategory = changedServiceCategory;
        changedServiceCategory = null;
        boolean oldChangedServiceCategoryESet = changedServiceCategoryESet;
        changedServiceCategoryESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY, oldChangedServiceCategory, null,
                    oldChangedServiceCategoryESet );
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
    public void unsetChangedServiceCategory() {
        if( changedServiceCategory != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changedServiceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__CONFIGURATION_EVENTS, ServiceCategory.class, msgs );
            msgs = basicUnsetChangedServiceCategory( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedServiceCategoryESet = changedServiceCategoryESet;
            changedServiceCategoryESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY, null, null,
                    oldChangedServiceCategoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangedServiceCategory() {
        return changedServiceCategoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Document getChangedDocument() {
        return changedDocument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangedDocument( Document newChangedDocument, NotificationChain msgs ) {
        Document oldChangedDocument = changedDocument;
        changedDocument = newChangedDocument;
        boolean oldChangedDocumentESet = changedDocumentESet;
        changedDocumentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT, oldChangedDocument, newChangedDocument,
                    !oldChangedDocumentESet );
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
    public void setChangedDocument( Document newChangedDocument ) {
        if( newChangedDocument != changedDocument ) {
            NotificationChain msgs = null;
            if( changedDocument != null ) msgs = ( ( InternalEObject ) changedDocument ).eInverseRemove( this,
                    CimPackage.DOCUMENT__CONFIGURATION_EVENTS, Document.class, msgs );
            if( newChangedDocument != null ) msgs = ( ( InternalEObject ) newChangedDocument ).eInverseAdd( this,
                    CimPackage.DOCUMENT__CONFIGURATION_EVENTS, Document.class, msgs );
            msgs = basicSetChangedDocument( newChangedDocument, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedDocumentESet = changedDocumentESet;
            changedDocumentESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT,
                            newChangedDocument, newChangedDocument, !oldChangedDocumentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangedDocument( NotificationChain msgs ) {
        Document oldChangedDocument = changedDocument;
        changedDocument = null;
        boolean oldChangedDocumentESet = changedDocumentESet;
        changedDocumentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT, oldChangedDocument, null,
                    oldChangedDocumentESet );
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
    public void unsetChangedDocument() {
        if( changedDocument != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changedDocument ).eInverseRemove( this,
                    CimPackage.DOCUMENT__CONFIGURATION_EVENTS, Document.class, msgs );
            msgs = basicUnsetChangedDocument( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedDocumentESet = changedDocumentESet;
            changedDocumentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT, null, null, oldChangedDocumentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangedDocument() {
        return changedDocumentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePoint getChangedUsagePoint() {
        return changedUsagePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangedUsagePoint( UsagePoint newChangedUsagePoint, NotificationChain msgs ) {
        UsagePoint oldChangedUsagePoint = changedUsagePoint;
        changedUsagePoint = newChangedUsagePoint;
        boolean oldChangedUsagePointESet = changedUsagePointESet;
        changedUsagePointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT, oldChangedUsagePoint, newChangedUsagePoint,
                    !oldChangedUsagePointESet );
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
    public void setChangedUsagePoint( UsagePoint newChangedUsagePoint ) {
        if( newChangedUsagePoint != changedUsagePoint ) {
            NotificationChain msgs = null;
            if( changedUsagePoint != null ) msgs = ( ( InternalEObject ) changedUsagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__CONFIGURATION_EVENTS, UsagePoint.class, msgs );
            if( newChangedUsagePoint != null ) msgs = ( ( InternalEObject ) newChangedUsagePoint ).eInverseAdd( this,
                    CimPackage.USAGE_POINT__CONFIGURATION_EVENTS, UsagePoint.class, msgs );
            msgs = basicSetChangedUsagePoint( newChangedUsagePoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedUsagePointESet = changedUsagePointESet;
            changedUsagePointESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT,
                            newChangedUsagePoint, newChangedUsagePoint, !oldChangedUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangedUsagePoint( NotificationChain msgs ) {
        UsagePoint oldChangedUsagePoint = changedUsagePoint;
        changedUsagePoint = null;
        boolean oldChangedUsagePointESet = changedUsagePointESet;
        changedUsagePointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT, oldChangedUsagePoint, null,
                    oldChangedUsagePointESet );
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
    public void unsetChangedUsagePoint() {
        if( changedUsagePoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changedUsagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__CONFIGURATION_EVENTS, UsagePoint.class, msgs );
            msgs = basicUnsetChangedUsagePoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedUsagePointESet = changedUsagePointESet;
            changedUsagePointESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT, null, null, oldChangedUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangedUsagePoint() {
        return changedUsagePointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PersonRole getChangedPersonRole() {
        return changedPersonRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangedPersonRole( PersonRole newChangedPersonRole, NotificationChain msgs ) {
        PersonRole oldChangedPersonRole = changedPersonRole;
        changedPersonRole = newChangedPersonRole;
        boolean oldChangedPersonRoleESet = changedPersonRoleESet;
        changedPersonRoleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE, oldChangedPersonRole, newChangedPersonRole,
                    !oldChangedPersonRoleESet );
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
    public void setChangedPersonRole( PersonRole newChangedPersonRole ) {
        if( newChangedPersonRole != changedPersonRole ) {
            NotificationChain msgs = null;
            if( changedPersonRole != null ) msgs = ( ( InternalEObject ) changedPersonRole ).eInverseRemove( this,
                    CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS, PersonRole.class, msgs );
            if( newChangedPersonRole != null ) msgs = ( ( InternalEObject ) newChangedPersonRole ).eInverseAdd( this,
                    CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS, PersonRole.class, msgs );
            msgs = basicSetChangedPersonRole( newChangedPersonRole, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedPersonRoleESet = changedPersonRoleESet;
            changedPersonRoleESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE,
                            newChangedPersonRole, newChangedPersonRole, !oldChangedPersonRoleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangedPersonRole( NotificationChain msgs ) {
        PersonRole oldChangedPersonRole = changedPersonRole;
        changedPersonRole = null;
        boolean oldChangedPersonRoleESet = changedPersonRoleESet;
        changedPersonRoleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE, oldChangedPersonRole, null,
                    oldChangedPersonRoleESet );
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
    public void unsetChangedPersonRole() {
        if( changedPersonRole != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changedPersonRole ).eInverseRemove( this,
                    CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS, PersonRole.class, msgs );
            msgs = basicUnsetChangedPersonRole( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedPersonRoleESet = changedPersonRoleESet;
            changedPersonRoleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE, null, null, oldChangedPersonRoleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangedPersonRole() {
        return changedPersonRoleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getChangedAsset() {
        return changedAsset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangedAsset( Asset newChangedAsset, NotificationChain msgs ) {
        Asset oldChangedAsset = changedAsset;
        changedAsset = newChangedAsset;
        boolean oldChangedAssetESet = changedAssetESet;
        changedAssetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET, oldChangedAsset, newChangedAsset,
                    !oldChangedAssetESet );
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
    public void setChangedAsset( Asset newChangedAsset ) {
        if( newChangedAsset != changedAsset ) {
            NotificationChain msgs = null;
            if( changedAsset != null ) msgs = ( ( InternalEObject ) changedAsset ).eInverseRemove( this,
                    CimPackage.ASSET__CONFIGURATION_EVENTS, Asset.class, msgs );
            if( newChangedAsset != null ) msgs = ( ( InternalEObject ) newChangedAsset ).eInverseAdd( this,
                    CimPackage.ASSET__CONFIGURATION_EVENTS, Asset.class, msgs );
            msgs = basicSetChangedAsset( newChangedAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedAssetESet = changedAssetESet;
            changedAssetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET,
                        newChangedAsset, newChangedAsset, !oldChangedAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangedAsset( NotificationChain msgs ) {
        Asset oldChangedAsset = changedAsset;
        changedAsset = null;
        boolean oldChangedAssetESet = changedAssetESet;
        changedAssetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET, oldChangedAsset, null, oldChangedAssetESet );
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
    public void unsetChangedAsset() {
        if( changedAsset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changedAsset ).eInverseRemove( this, CimPackage.ASSET__CONFIGURATION_EVENTS,
                    Asset.class, msgs );
            msgs = basicUnsetChangedAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedAssetESet = changedAssetESet;
            changedAssetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET, null, null, oldChangedAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangedAsset() {
        return changedAssetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OrganisationRole getChangedOrganisationRole() {
        return changedOrganisationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangedOrganisationRole( OrganisationRole newChangedOrganisationRole,
            NotificationChain msgs ) {
        OrganisationRole oldChangedOrganisationRole = changedOrganisationRole;
        changedOrganisationRole = newChangedOrganisationRole;
        boolean oldChangedOrganisationRoleESet = changedOrganisationRoleESet;
        changedOrganisationRoleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE, oldChangedOrganisationRole,
                    newChangedOrganisationRole, !oldChangedOrganisationRoleESet );
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
    public void setChangedOrganisationRole( OrganisationRole newChangedOrganisationRole ) {
        if( newChangedOrganisationRole != changedOrganisationRole ) {
            NotificationChain msgs = null;
            if( changedOrganisationRole != null )
                msgs = ( ( InternalEObject ) changedOrganisationRole ).eInverseRemove( this,
                        CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS, OrganisationRole.class, msgs );
            if( newChangedOrganisationRole != null )
                msgs = ( ( InternalEObject ) newChangedOrganisationRole ).eInverseAdd( this,
                        CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS, OrganisationRole.class, msgs );
            msgs = basicSetChangedOrganisationRole( newChangedOrganisationRole, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedOrganisationRoleESet = changedOrganisationRoleESet;
            changedOrganisationRoleESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE, newChangedOrganisationRole,
                    newChangedOrganisationRole, !oldChangedOrganisationRoleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangedOrganisationRole( NotificationChain msgs ) {
        OrganisationRole oldChangedOrganisationRole = changedOrganisationRole;
        changedOrganisationRole = null;
        boolean oldChangedOrganisationRoleESet = changedOrganisationRoleESet;
        changedOrganisationRoleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE, oldChangedOrganisationRole, null,
                    oldChangedOrganisationRoleESet );
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
    public void unsetChangedOrganisationRole() {
        if( changedOrganisationRole != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changedOrganisationRole ).eInverseRemove( this,
                    CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS, OrganisationRole.class, msgs );
            msgs = basicUnsetChangedOrganisationRole( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedOrganisationRoleESet = changedOrganisationRoleESet;
            changedOrganisationRoleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE, null, null,
                    oldChangedOrganisationRoleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangedOrganisationRole() {
        return changedOrganisationRoleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location getChangedLocation() {
        return changedLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChangedLocation( Location newChangedLocation, NotificationChain msgs ) {
        Location oldChangedLocation = changedLocation;
        changedLocation = newChangedLocation;
        boolean oldChangedLocationESet = changedLocationESet;
        changedLocationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION, oldChangedLocation, newChangedLocation,
                    !oldChangedLocationESet );
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
    public void setChangedLocation( Location newChangedLocation ) {
        if( newChangedLocation != changedLocation ) {
            NotificationChain msgs = null;
            if( changedLocation != null ) msgs = ( ( InternalEObject ) changedLocation ).eInverseRemove( this,
                    CimPackage.LOCATION__CONFIGURATION_EVENTS, Location.class, msgs );
            if( newChangedLocation != null ) msgs = ( ( InternalEObject ) newChangedLocation ).eInverseAdd( this,
                    CimPackage.LOCATION__CONFIGURATION_EVENTS, Location.class, msgs );
            msgs = basicSetChangedLocation( newChangedLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedLocationESet = changedLocationESet;
            changedLocationESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION,
                            newChangedLocation, newChangedLocation, !oldChangedLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetChangedLocation( NotificationChain msgs ) {
        Location oldChangedLocation = changedLocation;
        changedLocation = null;
        boolean oldChangedLocationESet = changedLocationESet;
        changedLocationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION, oldChangedLocation, null,
                    oldChangedLocationESet );
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
    public void unsetChangedLocation() {
        if( changedLocation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) changedLocation ).eInverseRemove( this,
                    CimPackage.LOCATION__CONFIGURATION_EVENTS, Location.class, msgs );
            msgs = basicUnsetChangedLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldChangedLocationESet = changedLocationESet;
            changedLocationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION, null, null, oldChangedLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangedLocation() {
        return changedLocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY:
            if( changedServiceCategory != null )
                msgs = ( ( InternalEObject ) changedServiceCategory ).eInverseRemove( this,
                        CimPackage.SERVICE_CATEGORY__CONFIGURATION_EVENTS, ServiceCategory.class, msgs );
            return basicSetChangedServiceCategory( ( ServiceCategory ) otherEnd, msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT:
            if( changedDocument != null ) msgs = ( ( InternalEObject ) changedDocument ).eInverseRemove( this,
                    CimPackage.DOCUMENT__CONFIGURATION_EVENTS, Document.class, msgs );
            return basicSetChangedDocument( ( Document ) otherEnd, msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT:
            if( changedUsagePoint != null ) msgs = ( ( InternalEObject ) changedUsagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__CONFIGURATION_EVENTS, UsagePoint.class, msgs );
            return basicSetChangedUsagePoint( ( UsagePoint ) otherEnd, msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE:
            if( changedPersonRole != null ) msgs = ( ( InternalEObject ) changedPersonRole ).eInverseRemove( this,
                    CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS, PersonRole.class, msgs );
            return basicSetChangedPersonRole( ( PersonRole ) otherEnd, msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET:
            if( changedAsset != null ) msgs = ( ( InternalEObject ) changedAsset ).eInverseRemove( this,
                    CimPackage.ASSET__CONFIGURATION_EVENTS, Asset.class, msgs );
            return basicSetChangedAsset( ( Asset ) otherEnd, msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE:
            if( changedOrganisationRole != null )
                msgs = ( ( InternalEObject ) changedOrganisationRole ).eInverseRemove( this,
                        CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS, OrganisationRole.class, msgs );
            return basicSetChangedOrganisationRole( ( OrganisationRole ) otherEnd, msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION:
            if( changedLocation != null ) msgs = ( ( InternalEObject ) changedLocation ).eInverseRemove( this,
                    CimPackage.LOCATION__CONFIGURATION_EVENTS, Location.class, msgs );
            return basicSetChangedLocation( ( Location ) otherEnd, msgs );
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
        case CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY:
            return basicUnsetChangedServiceCategory( msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT:
            return basicUnsetChangedDocument( msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT:
            return basicUnsetChangedUsagePoint( msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE:
            return basicUnsetChangedPersonRole( msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET:
            return basicUnsetChangedAsset( msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE:
            return basicUnsetChangedOrganisationRole( msgs );
        case CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION:
            return basicUnsetChangedLocation( msgs );
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
        case CimPackage.CONFIGURATION_EVENT__EFFECTIVE_DATE_TIME:
            return getEffectiveDateTime();
        case CimPackage.CONFIGURATION_EVENT__MODIFIED_BY:
            return getModifiedBy();
        case CimPackage.CONFIGURATION_EVENT__REMARK:
            return getRemark();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY:
            return getChangedServiceCategory();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT:
            return getChangedDocument();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT:
            return getChangedUsagePoint();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE:
            return getChangedPersonRole();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET:
            return getChangedAsset();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE:
            return getChangedOrganisationRole();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION:
            return getChangedLocation();
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
        case CimPackage.CONFIGURATION_EVENT__EFFECTIVE_DATE_TIME:
            setEffectiveDateTime( ( Date ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__MODIFIED_BY:
            setModifiedBy( ( String ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__REMARK:
            setRemark( ( String ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY:
            setChangedServiceCategory( ( ServiceCategory ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT:
            setChangedDocument( ( Document ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT:
            setChangedUsagePoint( ( UsagePoint ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE:
            setChangedPersonRole( ( PersonRole ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET:
            setChangedAsset( ( Asset ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE:
            setChangedOrganisationRole( ( OrganisationRole ) newValue );
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION:
            setChangedLocation( ( Location ) newValue );
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
        case CimPackage.CONFIGURATION_EVENT__EFFECTIVE_DATE_TIME:
            unsetEffectiveDateTime();
            return;
        case CimPackage.CONFIGURATION_EVENT__MODIFIED_BY:
            unsetModifiedBy();
            return;
        case CimPackage.CONFIGURATION_EVENT__REMARK:
            unsetRemark();
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY:
            unsetChangedServiceCategory();
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT:
            unsetChangedDocument();
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT:
            unsetChangedUsagePoint();
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE:
            unsetChangedPersonRole();
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET:
            unsetChangedAsset();
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE:
            unsetChangedOrganisationRole();
            return;
        case CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION:
            unsetChangedLocation();
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
        case CimPackage.CONFIGURATION_EVENT__EFFECTIVE_DATE_TIME:
            return isSetEffectiveDateTime();
        case CimPackage.CONFIGURATION_EVENT__MODIFIED_BY:
            return isSetModifiedBy();
        case CimPackage.CONFIGURATION_EVENT__REMARK:
            return isSetRemark();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_SERVICE_CATEGORY:
            return isSetChangedServiceCategory();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT:
            return isSetChangedDocument();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT:
            return isSetChangedUsagePoint();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE:
            return isSetChangedPersonRole();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ASSET:
            return isSetChangedAsset();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE:
            return isSetChangedOrganisationRole();
        case CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION:
            return isSetChangedLocation();
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
        result.append( " (effectiveDateTime: " );
        if( effectiveDateTimeESet )
            result.append( effectiveDateTime );
        else
            result.append( "<unset>" );
        result.append( ", modifiedBy: " );
        if( modifiedByESet )
            result.append( modifiedBy );
        else
            result.append( "<unset>" );
        result.append( ", remark: " );
        if( remarkESet )
            result.append( remark );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ConfigurationEventImpl
