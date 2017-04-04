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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RevenueKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getDailyFloorUsage <em>Daily Floor Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getRevenueKind <em>Revenue Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getTaxExemption <em>Tax Exemption</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PricingStructureImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PricingStructureImpl extends DocumentImpl implements PricingStructure {
    /**
     * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCode()
     * @generated
     * @ordered
     */
    protected static final String CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCode()
     * @generated
     * @ordered
     */
    protected String code = CODE_EDEFAULT;

    /**
     * This is true if the Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean codeESet;

    /**
     * The default value of the '{@link #getDailyCeilingUsage() <em>Daily Ceiling Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDailyCeilingUsage()
     * @generated
     * @ordered
     */
    protected static final Integer DAILY_CEILING_USAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDailyCeilingUsage() <em>Daily Ceiling Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDailyCeilingUsage()
     * @generated
     * @ordered
     */
    protected Integer dailyCeilingUsage = DAILY_CEILING_USAGE_EDEFAULT;

    /**
     * This is true if the Daily Ceiling Usage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dailyCeilingUsageESet;

    /**
     * The default value of the '{@link #getDailyEstimatedUsage() <em>Daily Estimated Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDailyEstimatedUsage()
     * @generated
     * @ordered
     */
    protected static final Integer DAILY_ESTIMATED_USAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDailyEstimatedUsage() <em>Daily Estimated Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDailyEstimatedUsage()
     * @generated
     * @ordered
     */
    protected Integer dailyEstimatedUsage = DAILY_ESTIMATED_USAGE_EDEFAULT;

    /**
     * This is true if the Daily Estimated Usage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dailyEstimatedUsageESet;

    /**
     * The default value of the '{@link #getDailyFloorUsage() <em>Daily Floor Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDailyFloorUsage()
     * @generated
     * @ordered
     */
    protected static final Integer DAILY_FLOOR_USAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDailyFloorUsage() <em>Daily Floor Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDailyFloorUsage()
     * @generated
     * @ordered
     */
    protected Integer dailyFloorUsage = DAILY_FLOOR_USAGE_EDEFAULT;

    /**
     * This is true if the Daily Floor Usage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dailyFloorUsageESet;

    /**
     * The default value of the '{@link #getRevenueKind() <em>Revenue Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevenueKind()
     * @generated
     * @ordered
     */
    protected static final RevenueKind REVENUE_KIND_EDEFAULT = RevenueKind.RESIDENTIAL;

    /**
     * The cached value of the '{@link #getRevenueKind() <em>Revenue Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevenueKind()
     * @generated
     * @ordered
     */
    protected RevenueKind revenueKind = REVENUE_KIND_EDEFAULT;

    /**
     * This is true if the Revenue Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revenueKindESet;

    /**
     * The default value of the '{@link #getTaxExemption() <em>Tax Exemption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaxExemption()
     * @generated
     * @ordered
     */
    protected static final Boolean TAX_EXEMPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTaxExemption() <em>Tax Exemption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaxExemption()
     * @generated
     * @ordered
     */
    protected Boolean taxExemption = TAX_EXEMPTION_EDEFAULT;

    /**
     * This is true if the Tax Exemption attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taxExemptionESet;

    /**
     * The cached value of the '{@link #getUsagePoints() <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoints()
     * @generated
     * @ordered
     */
    protected EList< UsagePoint > usagePoints;

    /**
     * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceCategory()
     * @generated
     * @ordered
     */
    protected ServiceCategory serviceCategory;

    /**
     * This is true if the Service Category reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceCategoryESet;

    /**
     * The cached value of the '{@link #getTariffs() <em>Tariffs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTariffs()
     * @generated
     * @ordered
     */
    protected EList< Tariff > tariffs;

    /**
     * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreements()
     * @generated
     * @ordered
     */
    protected EList< CustomerAgreement > customerAgreements;

    /**
     * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactions()
     * @generated
     * @ordered
     */
    protected EList< Transaction > transactions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PricingStructureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPricingStructure();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCode() {
        return code;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCode( String newCode ) {
        String oldCode = code;
        code = newCode;
        boolean oldCodeESet = codeESet;
        codeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRICING_STRUCTURE__CODE, oldCode, code, !oldCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCode() {
        String oldCode = code;
        boolean oldCodeESet = codeESet;
        code = CODE_EDEFAULT;
        codeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PRICING_STRUCTURE__CODE, oldCode, CODE_EDEFAULT, oldCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCode() {
        return codeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getDailyCeilingUsage() {
        return dailyCeilingUsage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDailyCeilingUsage( Integer newDailyCeilingUsage ) {
        Integer oldDailyCeilingUsage = dailyCeilingUsage;
        dailyCeilingUsage = newDailyCeilingUsage;
        boolean oldDailyCeilingUsageESet = dailyCeilingUsageESet;
        dailyCeilingUsageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE,
                    oldDailyCeilingUsage, dailyCeilingUsage, !oldDailyCeilingUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDailyCeilingUsage() {
        Integer oldDailyCeilingUsage = dailyCeilingUsage;
        boolean oldDailyCeilingUsageESet = dailyCeilingUsageESet;
        dailyCeilingUsage = DAILY_CEILING_USAGE_EDEFAULT;
        dailyCeilingUsageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE,
                    oldDailyCeilingUsage, DAILY_CEILING_USAGE_EDEFAULT, oldDailyCeilingUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDailyCeilingUsage() {
        return dailyCeilingUsageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getDailyEstimatedUsage() {
        return dailyEstimatedUsage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDailyEstimatedUsage( Integer newDailyEstimatedUsage ) {
        Integer oldDailyEstimatedUsage = dailyEstimatedUsage;
        dailyEstimatedUsage = newDailyEstimatedUsage;
        boolean oldDailyEstimatedUsageESet = dailyEstimatedUsageESet;
        dailyEstimatedUsageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE,
                    oldDailyEstimatedUsage, dailyEstimatedUsage, !oldDailyEstimatedUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDailyEstimatedUsage() {
        Integer oldDailyEstimatedUsage = dailyEstimatedUsage;
        boolean oldDailyEstimatedUsageESet = dailyEstimatedUsageESet;
        dailyEstimatedUsage = DAILY_ESTIMATED_USAGE_EDEFAULT;
        dailyEstimatedUsageESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE,
                        oldDailyEstimatedUsage, DAILY_ESTIMATED_USAGE_EDEFAULT, oldDailyEstimatedUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDailyEstimatedUsage() {
        return dailyEstimatedUsageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getDailyFloorUsage() {
        return dailyFloorUsage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDailyFloorUsage( Integer newDailyFloorUsage ) {
        Integer oldDailyFloorUsage = dailyFloorUsage;
        dailyFloorUsage = newDailyFloorUsage;
        boolean oldDailyFloorUsageESet = dailyFloorUsageESet;
        dailyFloorUsageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE,
                    oldDailyFloorUsage, dailyFloorUsage, !oldDailyFloorUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDailyFloorUsage() {
        Integer oldDailyFloorUsage = dailyFloorUsage;
        boolean oldDailyFloorUsageESet = dailyFloorUsageESet;
        dailyFloorUsage = DAILY_FLOOR_USAGE_EDEFAULT;
        dailyFloorUsageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE,
                    oldDailyFloorUsage, DAILY_FLOOR_USAGE_EDEFAULT, oldDailyFloorUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDailyFloorUsage() {
        return dailyFloorUsageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RevenueKind getRevenueKind() {
        return revenueKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevenueKind( RevenueKind newRevenueKind ) {
        RevenueKind oldRevenueKind = revenueKind;
        revenueKind = newRevenueKind == null ? REVENUE_KIND_EDEFAULT : newRevenueKind;
        boolean oldRevenueKindESet = revenueKindESet;
        revenueKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRICING_STRUCTURE__REVENUE_KIND, oldRevenueKind, revenueKind, !oldRevenueKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevenueKind() {
        RevenueKind oldRevenueKind = revenueKind;
        boolean oldRevenueKindESet = revenueKindESet;
        revenueKind = REVENUE_KIND_EDEFAULT;
        revenueKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRICING_STRUCTURE__REVENUE_KIND,
                    oldRevenueKind, REVENUE_KIND_EDEFAULT, oldRevenueKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevenueKind() {
        return revenueKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTaxExemption() {
        return taxExemption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTaxExemption( Boolean newTaxExemption ) {
        Boolean oldTaxExemption = taxExemption;
        taxExemption = newTaxExemption;
        boolean oldTaxExemptionESet = taxExemptionESet;
        taxExemptionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PRICING_STRUCTURE__TAX_EXEMPTION, oldTaxExemption, taxExemption, !oldTaxExemptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTaxExemption() {
        Boolean oldTaxExemption = taxExemption;
        boolean oldTaxExemptionESet = taxExemptionESet;
        taxExemption = TAX_EXEMPTION_EDEFAULT;
        taxExemptionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PRICING_STRUCTURE__TAX_EXEMPTION,
                    oldTaxExemption, TAX_EXEMPTION_EDEFAULT, oldTaxExemptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTaxExemption() {
        return taxExemptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePoint > getUsagePoints() {
        if( usagePoints == null ) {
            usagePoints = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< UsagePoint >( UsagePoint.class,
                    this, CimPackage.PRICING_STRUCTURE__USAGE_POINTS, CimPackage.USAGE_POINT__PRICING_STRUCTURES );
        }
        return usagePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoints() {
        if( usagePoints != null ) ( ( InternalEList.Unsettable< ? > ) usagePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoints() {
        return usagePoints != null && ( ( InternalEList.Unsettable< ? > ) usagePoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceCategory( ServiceCategory newServiceCategory, NotificationChain msgs ) {
        ServiceCategory oldServiceCategory = serviceCategory;
        serviceCategory = newServiceCategory;
        boolean oldServiceCategoryESet = serviceCategoryESet;
        serviceCategoryESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory,
                    !oldServiceCategoryESet );
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
    public void setServiceCategory( ServiceCategory newServiceCategory ) {
        if( newServiceCategory != serviceCategory ) {
            NotificationChain msgs = null;
            if( serviceCategory != null ) msgs = ( ( InternalEObject ) serviceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs );
            if( newServiceCategory != null ) msgs = ( ( InternalEObject ) newServiceCategory ).eInverseAdd( this,
                    CimPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs );
            msgs = basicSetServiceCategory( newServiceCategory, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCategoryESet = serviceCategoryESet;
            serviceCategoryESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY,
                        newServiceCategory, newServiceCategory, !oldServiceCategoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceCategory( NotificationChain msgs ) {
        ServiceCategory oldServiceCategory = serviceCategory;
        serviceCategory = null;
        boolean oldServiceCategoryESet = serviceCategoryESet;
        serviceCategoryESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY, oldServiceCategory, null, oldServiceCategoryESet );
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
    public void unsetServiceCategory() {
        if( serviceCategory != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs );
            msgs = basicUnsetServiceCategory( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCategoryESet = serviceCategoryESet;
            serviceCategoryESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY, null, null, oldServiceCategoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceCategory() {
        return serviceCategoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Tariff > getTariffs() {
        if( tariffs == null ) {
            tariffs = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Tariff >( Tariff.class, this,
                    CimPackage.PRICING_STRUCTURE__TARIFFS, CimPackage.TARIFF__PRICING_STRUCTURES );
        }
        return tariffs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTariffs() {
        if( tariffs != null ) ( ( InternalEList.Unsettable< ? > ) tariffs ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTariffs() {
        return tariffs != null && ( ( InternalEList.Unsettable< ? > ) tariffs ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerAgreement > getCustomerAgreements() {
        if( customerAgreements == null ) {
            customerAgreements = new EObjectWithInverseEList.Unsettable.ManyInverse< CustomerAgreement >(
                    CustomerAgreement.class, this, CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS,
                    CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES );
        }
        return customerAgreements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAgreements() {
        if( customerAgreements != null ) ( ( InternalEList.Unsettable< ? > ) customerAgreements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreements() {
        return customerAgreements != null && ( ( InternalEList.Unsettable< ? > ) customerAgreements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Transaction > getTransactions() {
        if( transactions == null ) {
            transactions = new EObjectWithInverseResolvingEList.Unsettable< Transaction >( Transaction.class, this,
                    CimPackage.PRICING_STRUCTURE__TRANSACTIONS, CimPackage.TRANSACTION__PRICING_STRUCTURE );
        }
        return transactions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransactions() {
        if( transactions != null ) ( ( InternalEList.Unsettable< ? > ) transactions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransactions() {
        return transactions != null && ( ( InternalEList.Unsettable< ? > ) transactions ).isSet();
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
        case CimPackage.PRICING_STRUCTURE__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
            if( serviceCategory != null ) msgs = ( ( InternalEObject ) serviceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs );
            return basicSetServiceCategory( ( ServiceCategory ) otherEnd, msgs );
        case CimPackage.PRICING_STRUCTURE__TARIFFS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTariffs() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerAgreements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PRICING_STRUCTURE__TRANSACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransactions() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.PRICING_STRUCTURE__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
            return basicUnsetServiceCategory( msgs );
        case CimPackage.PRICING_STRUCTURE__TARIFFS:
            return ( ( InternalEList< ? > ) getTariffs() ).basicRemove( otherEnd, msgs );
        case CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< ? > ) getCustomerAgreements() ).basicRemove( otherEnd, msgs );
        case CimPackage.PRICING_STRUCTURE__TRANSACTIONS:
            return ( ( InternalEList< ? > ) getTransactions() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PRICING_STRUCTURE__CODE:
            return getCode();
        case CimPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
            return getDailyCeilingUsage();
        case CimPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
            return getDailyEstimatedUsage();
        case CimPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
            return getDailyFloorUsage();
        case CimPackage.PRICING_STRUCTURE__REVENUE_KIND:
            return getRevenueKind();
        case CimPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
            return getTaxExemption();
        case CimPackage.PRICING_STRUCTURE__USAGE_POINTS:
            return getUsagePoints();
        case CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
            return getServiceCategory();
        case CimPackage.PRICING_STRUCTURE__TARIFFS:
            return getTariffs();
        case CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
            return getCustomerAgreements();
        case CimPackage.PRICING_STRUCTURE__TRANSACTIONS:
            return getTransactions();
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
        case CimPackage.PRICING_STRUCTURE__CODE:
            setCode( ( String ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
            setDailyCeilingUsage( ( Integer ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
            setDailyEstimatedUsage( ( Integer ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
            setDailyFloorUsage( ( Integer ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__REVENUE_KIND:
            setRevenueKind( ( RevenueKind ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
            setTaxExemption( ( Boolean ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
            setServiceCategory( ( ServiceCategory ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__TARIFFS:
            getTariffs().clear();
            getTariffs().addAll( ( Collection< ? extends Tariff > ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
            getCustomerAgreements().clear();
            getCustomerAgreements().addAll( ( Collection< ? extends CustomerAgreement > ) newValue );
            return;
        case CimPackage.PRICING_STRUCTURE__TRANSACTIONS:
            getTransactions().clear();
            getTransactions().addAll( ( Collection< ? extends Transaction > ) newValue );
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
        case CimPackage.PRICING_STRUCTURE__CODE:
            unsetCode();
            return;
        case CimPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
            unsetDailyCeilingUsage();
            return;
        case CimPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
            unsetDailyEstimatedUsage();
            return;
        case CimPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
            unsetDailyFloorUsage();
            return;
        case CimPackage.PRICING_STRUCTURE__REVENUE_KIND:
            unsetRevenueKind();
            return;
        case CimPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
            unsetTaxExemption();
            return;
        case CimPackage.PRICING_STRUCTURE__USAGE_POINTS:
            unsetUsagePoints();
            return;
        case CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
            unsetServiceCategory();
            return;
        case CimPackage.PRICING_STRUCTURE__TARIFFS:
            unsetTariffs();
            return;
        case CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
            unsetCustomerAgreements();
            return;
        case CimPackage.PRICING_STRUCTURE__TRANSACTIONS:
            unsetTransactions();
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
        case CimPackage.PRICING_STRUCTURE__CODE:
            return isSetCode();
        case CimPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
            return isSetDailyCeilingUsage();
        case CimPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
            return isSetDailyEstimatedUsage();
        case CimPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
            return isSetDailyFloorUsage();
        case CimPackage.PRICING_STRUCTURE__REVENUE_KIND:
            return isSetRevenueKind();
        case CimPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
            return isSetTaxExemption();
        case CimPackage.PRICING_STRUCTURE__USAGE_POINTS:
            return isSetUsagePoints();
        case CimPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
            return isSetServiceCategory();
        case CimPackage.PRICING_STRUCTURE__TARIFFS:
            return isSetTariffs();
        case CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
            return isSetCustomerAgreements();
        case CimPackage.PRICING_STRUCTURE__TRANSACTIONS:
            return isSetTransactions();
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
        result.append( " (code: " );
        if( codeESet )
            result.append( code );
        else
            result.append( "<unset>" );
        result.append( ", dailyCeilingUsage: " );
        if( dailyCeilingUsageESet )
            result.append( dailyCeilingUsage );
        else
            result.append( "<unset>" );
        result.append( ", dailyEstimatedUsage: " );
        if( dailyEstimatedUsageESet )
            result.append( dailyEstimatedUsage );
        else
            result.append( "<unset>" );
        result.append( ", dailyFloorUsage: " );
        if( dailyFloorUsageESet )
            result.append( dailyFloorUsage );
        else
            result.append( "<unset>" );
        result.append( ", revenueKind: " );
        if( revenueKindESet )
            result.append( revenueKind );
        else
            result.append( "<unset>" );
        result.append( ", taxExemption: " );
        if( taxExemptionESet )
            result.append( taxExemption );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PricingStructureImpl
