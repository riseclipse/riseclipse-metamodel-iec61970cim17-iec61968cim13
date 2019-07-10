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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutageItemProvider extends DocumentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutageItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addCancelledDateTimePropertyDescriptor( object );
            addCausePropertyDescriptor( object );
            addCauseKindPropertyDescriptor( object );
            addCommunityDescriptorPropertyDescriptor( object );
            addCustomersRestoredPropertyDescriptor( object );
            addIsPlannedPropertyDescriptor( object );
            addMetersAffectedPropertyDescriptor( object );
            addOriginalCustomersServedPropertyDescriptor( object );
            addOriginalMetersAffectedPropertyDescriptor( object );
            addOutageKindPropertyDescriptor( object );
            addStartTimePropertyDescriptor( object );
            addStatusKindPropertyDescriptor( object );
            addUtilityDisclaimerPropertyDescriptor( object );
            addOpenedSwitchesPropertyDescriptor( object );
            addSwitchingPlansPropertyDescriptor( object );
            addEstimatedRestorationTimePropertyDescriptor( object );
            addUpdatedRatingsPropertyDescriptor( object );
            addOutageAreaPropertyDescriptor( object );
            addUsagePointsPropertyDescriptor( object );
            addPlannedSwitchActionsPropertyDescriptor( object );
            addIncidentPropertyDescriptor( object );
            addEquipmentsPropertyDescriptor( object );
            addFaultsPropertyDescriptor( object );
            addOutageSchedulePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Cancelled Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCancelledDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_cancelledDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_cancelledDateTime_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_CancelledDateTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cause feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCausePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_cause_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_cause_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Cause(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cause Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCauseKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_causeKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_causeKind_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_CauseKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Community Descriptor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommunityDescriptorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_communityDescriptor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_communityDescriptor_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_CommunityDescriptor(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customers Restored feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomersRestoredPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_customersRestored_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_customersRestored_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_CustomersRestored(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Planned feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsPlannedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_isPlanned_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_isPlanned_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_IsPlanned(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Meters Affected feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMetersAffectedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_metersAffected_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_metersAffected_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_MetersAffected(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Original Customers Served feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOriginalCustomersServedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_originalCustomersServed_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_originalCustomersServed_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OriginalCustomersServed(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Original Meters Affected feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOriginalMetersAffectedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_originalMetersAffected_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_originalMetersAffected_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OriginalMetersAffected(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Outage Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutageKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_outageKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_outageKind_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OutageKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Start Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_startTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_startTime_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_StartTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Status Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatusKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_statusKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_statusKind_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_StatusKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Utility Disclaimer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUtilityDisclaimerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_utilityDisclaimer_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_utilityDisclaimer_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_UtilityDisclaimer(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Opened Switches feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOpenedSwitchesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_OpenedSwitches_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_OpenedSwitches_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OpenedSwitches(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switching Plans feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchingPlansPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_SwitchingPlans_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_SwitchingPlans_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_SwitchingPlans(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Estimated Restoration Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEstimatedRestorationTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_EstimatedRestorationTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_EstimatedRestorationTime_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_EstimatedRestorationTime(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Updated Ratings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpdatedRatingsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_UpdatedRatings_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_UpdatedRatings_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_UpdatedRatings(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Outage Area feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutageAreaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_OutageArea_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_OutageArea_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OutageArea(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Usage Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_UsagePoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_UsagePoints_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_UsagePoints(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Planned Switch Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlannedSwitchActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_PlannedSwitchActions_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_PlannedSwitchActions_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_PlannedSwitchActions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Incident feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncidentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_Incident_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_Incident_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Incident(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Equipments feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEquipmentsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_Equipments_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_Equipments_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Equipments(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Faults feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFaultsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_Faults_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_Faults_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_Faults(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Outage Schedule feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutageSchedulePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Outage_OutageSchedule_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Outage_OutageSchedule_feature",
                                "_UI_Outage_type" ),
                        CimPackage.eINSTANCE.getOutage_OutageSchedule(), true, false, true, null, null, null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( CimPackage.eINSTANCE.getOutage_ActualPeriod() );
            childrenFeatures.add( CimPackage.eINSTANCE.getOutage_EstimatedPeriod() );
            childrenFeatures.add( CimPackage.eINSTANCE.getOutage_Summary() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns Outage.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Outage" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Outage ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Outage_type" )
                : getString( "_UI_Outage_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( Outage.class ) ) {
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
        case CimPackage.OUTAGE__CAUSE:
        case CimPackage.OUTAGE__CAUSE_KIND:
        case CimPackage.OUTAGE__COMMUNITY_DESCRIPTOR:
        case CimPackage.OUTAGE__CUSTOMERS_RESTORED:
        case CimPackage.OUTAGE__IS_PLANNED:
        case CimPackage.OUTAGE__METERS_AFFECTED:
        case CimPackage.OUTAGE__ORIGINAL_CUSTOMERS_SERVED:
        case CimPackage.OUTAGE__ORIGINAL_METERS_AFFECTED:
        case CimPackage.OUTAGE__OUTAGE_KIND:
        case CimPackage.OUTAGE__START_TIME:
        case CimPackage.OUTAGE__STATUS_KIND:
        case CimPackage.OUTAGE__UTILITY_DISCLAIMER:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
        case CimPackage.OUTAGE__SUMMARY:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getOutage_ActualPeriod(),
                CimFactory.eINSTANCE.createDateTimeInterval() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getOutage_EstimatedPeriod(),
                CimFactory.eINSTANCE.createDateTimeInterval() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getOutage_Summary(),
                CimFactory.eINSTANCE.createServicePointOutageSummary() ) );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CimPackage.eINSTANCE.getDocument_DocStatus()
                || childFeature == CimPackage.eINSTANCE.getDocument_Status()
                || childFeature == CimPackage.eINSTANCE.getOutage_ActualPeriod()
                || childFeature == CimPackage.eINSTANCE.getOutage_EstimatedPeriod();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
