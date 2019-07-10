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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DemandResponseProgram;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceLocation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceSupplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Customer Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getIsPrePay <em>Is Pre Pay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getLoadMgmt <em>Load Mgmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getShutOffDateTime <em>Shut Off Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getDemandResponsePrograms <em>Demand Response Programs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getServiceLocations <em>Service Locations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CustomerAgreementImpl#getServiceCategory <em>Service Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerAgreementImpl extends AgreementImpl implements CustomerAgreement {
    /**
     * The default value of the '{@link #getIsPrePay() <em>Is Pre Pay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPrePay()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_PRE_PAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPrePay() <em>Is Pre Pay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPrePay()
     * @generated
     * @ordered
     */
    protected Boolean isPrePay = IS_PRE_PAY_EDEFAULT;

    /**
     * This is true if the Is Pre Pay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPrePayESet;

    /**
     * The default value of the '{@link #getLoadMgmt() <em>Load Mgmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadMgmt()
     * @generated
     * @ordered
     */
    protected static final String LOAD_MGMT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLoadMgmt() <em>Load Mgmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadMgmt()
     * @generated
     * @ordered
     */
    protected String loadMgmt = LOAD_MGMT_EDEFAULT;

    /**
     * This is true if the Load Mgmt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadMgmtESet;

    /**
     * The default value of the '{@link #getShutOffDateTime() <em>Shut Off Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShutOffDateTime()
     * @generated
     * @ordered
     */
    protected static final Date SHUT_OFF_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShutOffDateTime() <em>Shut Off Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShutOffDateTime()
     * @generated
     * @ordered
     */
    protected Date shutOffDateTime = SHUT_OFF_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Shut Off Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shutOffDateTimeESet;

    /**
     * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPricingStructures()
     * @generated
     * @ordered
     */
    protected EList< PricingStructure > pricingStructures;

    /**
     * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterReadings()
     * @generated
     * @ordered
     */
    protected EList< MeterReading > meterReadings;

    /**
     * The cached value of the '{@link #getAuxiliaryAgreements() <em>Auxiliary Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxiliaryAgreements()
     * @generated
     * @ordered
     */
    protected EList< AuxiliaryAgreement > auxiliaryAgreements;

    /**
     * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomer()
     * @generated
     * @ordered
     */
    protected Customer customer;

    /**
     * This is true if the Customer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerESet;

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
     * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAccount()
     * @generated
     * @ordered
     */
    protected CustomerAccount customerAccount;

    /**
     * This is true if the Customer Account reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerAccountESet;

    /**
     * The cached value of the '{@link #getServiceSupplier() <em>Service Supplier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceSupplier()
     * @generated
     * @ordered
     */
    protected ServiceSupplier serviceSupplier;

    /**
     * This is true if the Service Supplier reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceSupplierESet;

    /**
     * The cached value of the '{@link #getDemandResponsePrograms() <em>Demand Response Programs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDemandResponsePrograms()
     * @generated
     * @ordered
     */
    protected EList< DemandResponseProgram > demandResponsePrograms;

    /**
     * The cached value of the '{@link #getServiceLocations() <em>Service Locations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceLocations()
     * @generated
     * @ordered
     */
    protected EList< ServiceLocation > serviceLocations;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomerAgreementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCustomerAgreement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPrePay() {
        return isPrePay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPrePay( Boolean newIsPrePay ) {
        Boolean oldIsPrePay = isPrePay;
        isPrePay = newIsPrePay;
        boolean oldIsPrePayESet = isPrePayESet;
        isPrePayESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_AGREEMENT__IS_PRE_PAY, oldIsPrePay, isPrePay, !oldIsPrePayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPrePay() {
        Boolean oldIsPrePay = isPrePay;
        boolean oldIsPrePayESet = isPrePayESet;
        isPrePay = IS_PRE_PAY_EDEFAULT;
        isPrePayESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER_AGREEMENT__IS_PRE_PAY, oldIsPrePay, IS_PRE_PAY_EDEFAULT, oldIsPrePayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPrePay() {
        return isPrePayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLoadMgmt() {
        return loadMgmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoadMgmt( String newLoadMgmt ) {
        String oldLoadMgmt = loadMgmt;
        loadMgmt = newLoadMgmt;
        boolean oldLoadMgmtESet = loadMgmtESet;
        loadMgmtESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CUSTOMER_AGREEMENT__LOAD_MGMT, oldLoadMgmt, loadMgmt, !oldLoadMgmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLoadMgmt() {
        String oldLoadMgmt = loadMgmt;
        boolean oldLoadMgmtESet = loadMgmtESet;
        loadMgmt = LOAD_MGMT_EDEFAULT;
        loadMgmtESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CUSTOMER_AGREEMENT__LOAD_MGMT, oldLoadMgmt, LOAD_MGMT_EDEFAULT, oldLoadMgmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadMgmt() {
        return loadMgmtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getShutOffDateTime() {
        return shutOffDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShutOffDateTime( Date newShutOffDateTime ) {
        Date oldShutOffDateTime = shutOffDateTime;
        shutOffDateTime = newShutOffDateTime;
        boolean oldShutOffDateTimeESet = shutOffDateTimeESet;
        shutOffDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CUSTOMER_AGREEMENT__SHUT_OFF_DATE_TIME,
                    oldShutOffDateTime, shutOffDateTime, !oldShutOffDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShutOffDateTime() {
        Date oldShutOffDateTime = shutOffDateTime;
        boolean oldShutOffDateTimeESet = shutOffDateTimeESet;
        shutOffDateTime = SHUT_OFF_DATE_TIME_EDEFAULT;
        shutOffDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CUSTOMER_AGREEMENT__SHUT_OFF_DATE_TIME,
                    oldShutOffDateTime, SHUT_OFF_DATE_TIME_EDEFAULT, oldShutOffDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShutOffDateTime() {
        return shutOffDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PricingStructure > getPricingStructures() {
        if( pricingStructures == null ) {
            pricingStructures = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< PricingStructure >(
                    PricingStructure.class, this, CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES,
                    CimPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS );
        }
        return pricingStructures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPricingStructures() {
        if( pricingStructures != null ) ( ( InternalEList.Unsettable< ? > ) pricingStructures ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPricingStructures() {
        return pricingStructures != null && ( ( InternalEList.Unsettable< ? > ) pricingStructures ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeterReading > getMeterReadings() {
        if( meterReadings == null ) {
            meterReadings = new EObjectWithInverseResolvingEList.Unsettable< MeterReading >( MeterReading.class, this,
                    CimPackage.CUSTOMER_AGREEMENT__METER_READINGS, CimPackage.METER_READING__CUSTOMER_AGREEMENT );
        }
        return meterReadings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterReadings() {
        if( meterReadings != null ) ( ( InternalEList.Unsettable< ? > ) meterReadings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterReadings() {
        return meterReadings != null && ( ( InternalEList.Unsettable< ? > ) meterReadings ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AuxiliaryAgreement > getAuxiliaryAgreements() {
        if( auxiliaryAgreements == null ) {
            auxiliaryAgreements = new EObjectWithInverseResolvingEList.Unsettable< AuxiliaryAgreement >(
                    AuxiliaryAgreement.class, this, CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS,
                    CimPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT );
        }
        return auxiliaryAgreements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxiliaryAgreements() {
        if( auxiliaryAgreements != null ) ( ( InternalEList.Unsettable< ? > ) auxiliaryAgreements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxiliaryAgreements() {
        return auxiliaryAgreements != null && ( ( InternalEList.Unsettable< ? > ) auxiliaryAgreements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Customer getCustomer() {
        return customer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomer( Customer newCustomer, NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = newCustomer;
        boolean oldCustomerESet = customerESet;
        customerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER, oldCustomer, newCustomer, !oldCustomerESet );
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
    public void setCustomer( Customer newCustomer ) {
        if( newCustomer != customer ) {
            NotificationChain msgs = null;
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs );
            if( newCustomer != null ) msgs = ( ( InternalEObject ) newCustomer ).eInverseAdd( this,
                    CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs );
            msgs = basicSetCustomer( newCustomer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER, newCustomer, newCustomer, !oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomer( NotificationChain msgs ) {
        Customer oldCustomer = customer;
        customer = null;
        boolean oldCustomerESet = customerESet;
        customerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER, oldCustomer, null, oldCustomerESet );
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
    public void unsetCustomer() {
        if( customer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customer ).eInverseRemove( this, CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS,
                    Customer.class, msgs );
            msgs = basicUnsetCustomer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerESet = customerESet;
            customerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER, null, null, oldCustomerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomer() {
        return customerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePoint > getUsagePoints() {
        if( usagePoints == null ) {
            usagePoints = new EObjectWithInverseResolvingEList.Unsettable< UsagePoint >( UsagePoint.class, this,
                    CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS, CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT );
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
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomerAccount( CustomerAccount newCustomerAccount, NotificationChain msgs ) {
        CustomerAccount oldCustomerAccount = customerAccount;
        customerAccount = newCustomerAccount;
        boolean oldCustomerAccountESet = customerAccountESet;
        customerAccountESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT, oldCustomerAccount, newCustomerAccount,
                    !oldCustomerAccountESet );
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
    public void setCustomerAccount( CustomerAccount newCustomerAccount ) {
        if( newCustomerAccount != customerAccount ) {
            NotificationChain msgs = null;
            if( customerAccount != null ) msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs );
            if( newCustomerAccount != null ) msgs = ( ( InternalEObject ) newCustomerAccount ).eInverseAdd( this,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs );
            msgs = basicSetCustomerAccount( newCustomerAccount, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAccountESet = customerAccountESet;
            customerAccountESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT,
                        newCustomerAccount, newCustomerAccount, !oldCustomerAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomerAccount( NotificationChain msgs ) {
        CustomerAccount oldCustomerAccount = customerAccount;
        customerAccount = null;
        boolean oldCustomerAccountESet = customerAccountESet;
        customerAccountESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT, oldCustomerAccount, null, oldCustomerAccountESet );
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
    public void unsetCustomerAccount() {
        if( customerAccount != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs );
            msgs = basicUnsetCustomerAccount( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAccountESet = customerAccountESet;
            customerAccountESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT, null, null, oldCustomerAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAccount() {
        return customerAccountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSupplier getServiceSupplier() {
        return serviceSupplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceSupplier( ServiceSupplier newServiceSupplier, NotificationChain msgs ) {
        ServiceSupplier oldServiceSupplier = serviceSupplier;
        serviceSupplier = newServiceSupplier;
        boolean oldServiceSupplierESet = serviceSupplierESet;
        serviceSupplierESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER, oldServiceSupplier, newServiceSupplier,
                    !oldServiceSupplierESet );
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
    public void setServiceSupplier( ServiceSupplier newServiceSupplier ) {
        if( newServiceSupplier != serviceSupplier ) {
            NotificationChain msgs = null;
            if( serviceSupplier != null ) msgs = ( ( InternalEObject ) serviceSupplier ).eInverseRemove( this,
                    CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs );
            if( newServiceSupplier != null ) msgs = ( ( InternalEObject ) newServiceSupplier ).eInverseAdd( this,
                    CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs );
            msgs = basicSetServiceSupplier( newServiceSupplier, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceSupplierESet = serviceSupplierESet;
            serviceSupplierESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER,
                        newServiceSupplier, newServiceSupplier, !oldServiceSupplierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceSupplier( NotificationChain msgs ) {
        ServiceSupplier oldServiceSupplier = serviceSupplier;
        serviceSupplier = null;
        boolean oldServiceSupplierESet = serviceSupplierESet;
        serviceSupplierESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER, oldServiceSupplier, null, oldServiceSupplierESet );
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
    public void unsetServiceSupplier() {
        if( serviceSupplier != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceSupplier ).eInverseRemove( this,
                    CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs );
            msgs = basicUnsetServiceSupplier( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceSupplierESet = serviceSupplierESet;
            serviceSupplierESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER, null, null, oldServiceSupplierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceSupplier() {
        return serviceSupplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DemandResponseProgram > getDemandResponsePrograms() {
        if( demandResponsePrograms == null ) {
            demandResponsePrograms = new EObjectWithInverseEList.Unsettable.ManyInverse< DemandResponseProgram >(
                    DemandResponseProgram.class, this, CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS );
        }
        return demandResponsePrograms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDemandResponsePrograms() {
        if( demandResponsePrograms != null ) ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDemandResponsePrograms() {
        return demandResponsePrograms != null && ( ( InternalEList.Unsettable< ? > ) demandResponsePrograms ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceLocation > getServiceLocations() {
        if( serviceLocations == null ) {
            serviceLocations = new EObjectWithInverseEList.Unsettable.ManyInverse< ServiceLocation >(
                    ServiceLocation.class, this, CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS,
                    CimPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS );
        }
        return serviceLocations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceLocations() {
        if( serviceLocations != null ) ( ( InternalEList.Unsettable< ? > ) serviceLocations ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceLocations() {
        return serviceLocations != null && ( ( InternalEList.Unsettable< ? > ) serviceLocations ).isSet();
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
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory,
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
                    CimPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, ServiceCategory.class, msgs );
            if( newServiceCategory != null ) msgs = ( ( InternalEObject ) newServiceCategory ).eInverseAdd( this,
                    CimPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, ServiceCategory.class, msgs );
            msgs = basicSetServiceCategory( newServiceCategory, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCategoryESet = serviceCategoryESet;
            serviceCategoryESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY,
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
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY, oldServiceCategory, null, oldServiceCategoryESet );
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
                    CimPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, ServiceCategory.class, msgs );
            msgs = basicUnsetServiceCategory( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCategoryESet = serviceCategoryESet;
            serviceCategoryESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY, null, null, oldServiceCategoryESet ) );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPricingStructures() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__METER_READINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterReadings() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAuxiliaryAgreements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER:
            if( customer != null ) msgs = ( ( InternalEObject ) customer ).eInverseRemove( this,
                    CimPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs );
            return basicSetCustomer( ( Customer ) otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
            if( customerAccount != null ) msgs = ( ( InternalEObject ) customerAccount ).eInverseRemove( this,
                    CimPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs );
            return basicSetCustomerAccount( ( CustomerAccount ) otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
            if( serviceSupplier != null ) msgs = ( ( InternalEObject ) serviceSupplier ).eInverseRemove( this,
                    CimPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs );
            return basicSetServiceSupplier( ( ServiceSupplier ) otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDemandResponsePrograms() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getServiceLocations() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
            if( serviceCategory != null ) msgs = ( ( InternalEObject ) serviceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, ServiceCategory.class, msgs );
            return basicSetServiceCategory( ( ServiceCategory ) otherEnd, msgs );
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
        case CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
            return ( ( InternalEList< ? > ) getPricingStructures() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__METER_READINGS:
            return ( ( InternalEList< ? > ) getMeterReadings() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
            return ( ( InternalEList< ? > ) getAuxiliaryAgreements() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER:
            return basicUnsetCustomer( msgs );
        case CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
            return basicUnsetCustomerAccount( msgs );
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
            return basicUnsetServiceSupplier( msgs );
        case CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS:
            return ( ( InternalEList< ? > ) getDemandResponsePrograms() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
            return ( ( InternalEList< ? > ) getServiceLocations() ).basicRemove( otherEnd, msgs );
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
            return basicUnsetServiceCategory( msgs );
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
        case CimPackage.CUSTOMER_AGREEMENT__IS_PRE_PAY:
            return getIsPrePay();
        case CimPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
            return getLoadMgmt();
        case CimPackage.CUSTOMER_AGREEMENT__SHUT_OFF_DATE_TIME:
            return getShutOffDateTime();
        case CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
            return getPricingStructures();
        case CimPackage.CUSTOMER_AGREEMENT__METER_READINGS:
            return getMeterReadings();
        case CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
            return getAuxiliaryAgreements();
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER:
            return getCustomer();
        case CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS:
            return getUsagePoints();
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
            return getCustomerAccount();
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
            return getServiceSupplier();
        case CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS:
            return getDemandResponsePrograms();
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
            return getServiceLocations();
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
            return getServiceCategory();
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
        case CimPackage.CUSTOMER_AGREEMENT__IS_PRE_PAY:
            setIsPrePay( ( Boolean ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
            setLoadMgmt( ( String ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SHUT_OFF_DATE_TIME:
            setShutOffDateTime( ( Date ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
            getPricingStructures().clear();
            getPricingStructures().addAll( ( Collection< ? extends PricingStructure > ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__METER_READINGS:
            getMeterReadings().clear();
            getMeterReadings().addAll( ( Collection< ? extends MeterReading > ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
            getAuxiliaryAgreements().clear();
            getAuxiliaryAgreements().addAll( ( Collection< ? extends AuxiliaryAgreement > ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER:
            setCustomer( ( Customer ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
            setCustomerAccount( ( CustomerAccount ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
            setServiceSupplier( ( ServiceSupplier ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS:
            getDemandResponsePrograms().clear();
            getDemandResponsePrograms().addAll( ( Collection< ? extends DemandResponseProgram > ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
            getServiceLocations().clear();
            getServiceLocations().addAll( ( Collection< ? extends ServiceLocation > ) newValue );
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
            setServiceCategory( ( ServiceCategory ) newValue );
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
        case CimPackage.CUSTOMER_AGREEMENT__IS_PRE_PAY:
            unsetIsPrePay();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
            unsetLoadMgmt();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SHUT_OFF_DATE_TIME:
            unsetShutOffDateTime();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
            unsetPricingStructures();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__METER_READINGS:
            unsetMeterReadings();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
            unsetAuxiliaryAgreements();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER:
            unsetCustomer();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS:
            unsetUsagePoints();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
            unsetCustomerAccount();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
            unsetServiceSupplier();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS:
            unsetDemandResponsePrograms();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
            unsetServiceLocations();
            return;
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
            unsetServiceCategory();
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
        case CimPackage.CUSTOMER_AGREEMENT__IS_PRE_PAY:
            return isSetIsPrePay();
        case CimPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
            return isSetLoadMgmt();
        case CimPackage.CUSTOMER_AGREEMENT__SHUT_OFF_DATE_TIME:
            return isSetShutOffDateTime();
        case CimPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
            return isSetPricingStructures();
        case CimPackage.CUSTOMER_AGREEMENT__METER_READINGS:
            return isSetMeterReadings();
        case CimPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
            return isSetAuxiliaryAgreements();
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER:
            return isSetCustomer();
        case CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS:
            return isSetUsagePoints();
        case CimPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
            return isSetCustomerAccount();
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
            return isSetServiceSupplier();
        case CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS:
            return isSetDemandResponsePrograms();
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
            return isSetServiceLocations();
        case CimPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY:
            return isSetServiceCategory();
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
        result.append( " (isPrePay: " );
        if( isPrePayESet )
            result.append( isPrePay );
        else
            result.append( "<unset>" );
        result.append( ", loadMgmt: " );
        if( loadMgmtESet )
            result.append( loadMgmt );
        else
            result.append( "<unset>" );
        result.append( ", shutOffDateTime: " );
        if( shutOffDateTimeESet )
            result.append( shutOffDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CustomerAgreementImpl
